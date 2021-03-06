package com.arm.pelion.sdk.foundation.generator.model;

import com.arm.pelion.sdk.foundation.generator.util.TranslationException;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;

public abstract class TypeCompose extends TypeParameter {

    protected TypeParameter contentType;
    protected boolean concreteImplementation;

    public TypeCompose() {
        this(false);
    }

    public TypeCompose(boolean concrete) {
        this(new TypeParameter(), concrete);
    }

    public TypeCompose(TypeParameter contentType) {
        this(contentType, false);
    }

    public TypeCompose(String type, String format) {
        this(new TypeParameter(type, format));
    }

    public TypeCompose(TypeParameter contentType, boolean concrete) {
        super();
        this.contentType = convertToWrappersIfNeeded(contentType);
        this.concreteImplementation = concrete;
    }

    protected TypeCompose(Import importPath, Class<?> clazz, TypeName typeName, String type, String format,
                          TypeParameter contentType, boolean concrete) {
        super(importPath, clazz, typeName, type, format);
        this.concreteImplementation = concrete;
        this.contentType = contentType;
    }

    private TypeParameter convertToWrappersIfNeeded(TypeParameter contentType) {
        if (contentType == null) {
            return null;
        }
        contentType.transformIntoWrapper();
        return contentType;
    }

    public TypeCompose(Import importPath) {
        this(new TypeParameter(importPath));
    }

    public TypeCompose(Class<?> clazz) {
        this(new TypeParameter(clazz));
    }

    @Override
    public void translate() throws TranslationException {
        if (contentType == null) {
            throw new TranslationException("The type definition of the composed type is unknown ");
        }
        try {
            contentType.translate();
            setImportPath();
            TranslateTypeNameBasedOnContentType();
        } catch (@SuppressWarnings("unused") Exception e) {
            // e.printStackTrace();
            setClazz(getCollectionClass());
            super.translate();
        }
    }

    @Override
    public boolean isNumber() {
        return false;
    }

    @Override
    public boolean isBoolean() {
        return false;
    }

    protected void setImportPath() {
        setImportPath(new Import(getCollectionClass().getSimpleName(), getCollectionClass().getPackage().getName()));
    }

    public TypeParameter getContentType() {
        return contentType;
    }

    public void setContentType(TypeParameter contentType) {
        this.contentType = contentType == null ? new TypeParameter() : contentType;
    }

    protected boolean isConcreteImplementation() {
        return concreteImplementation;
    }

    protected void setConcreteImplementation(boolean concreteImplementation) {
        this.concreteImplementation = concreteImplementation;
    }

    @SuppressWarnings("unchecked")
    protected <T extends TypeCompose> T concreteImplementation(boolean concreteImplementation) {
        setConcreteImplementation(concreteImplementation);
        return (T) this;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + (concreteImplementation ? 1231 : 1237);
        result = prime * result + ((contentType == null) ? 0 : contentType.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        TypeCompose other = (TypeCompose) obj;
        if (concreteImplementation != other.concreteImplementation)
            return false;
        if (contentType == null) {
            if (other.contentType != null)
                return false;
        } else if (!contentType.equals(other.contentType))
            return false;
        return true;
    }

    @Override
    public boolean isModel() {
        return false;
    }

    @Override
    public boolean isComposed() {
        return true;
    }

    @Override
    public String getShortName() {
        return getCollectionClass().getSimpleName();
    }

    @Override
    public String getFullyQualifiedName() {
        return getCollectionClass().getName();
    }

    protected void TranslateTypeNameBasedOnContentType() {
        setTypeName(contentType.hasClass() ? ParameterizedTypeName.get(getCollectionClass(), contentType.getClazz())
                                           : ParameterizedTypeName.get(ClassName.get(getCollectionClass()),
                                                                       contentType.getTypeName()));

    }

    @Override
    public Class<?> getRawClass() {
        return getCollectionClass();
    }

    protected abstract Class<?> getCollectionClass();

}
