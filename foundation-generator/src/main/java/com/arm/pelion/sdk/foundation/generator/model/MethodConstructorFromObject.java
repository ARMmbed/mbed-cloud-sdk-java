package com.arm.pelion.sdk.foundation.generator.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodConstructorFromObject extends AbstractMethodConstructor {
    protected Parameter parameter;

    public MethodConstructorFromObject(Model currentModel, Model parentModel) {
        super(currentModel, parentModel, null, null, true);
        setParameter();
    }

    @Override
    protected void addConstructorParameters() {
        setParameter();
        addParameter(parameter);

    }

    private void setParameter() {
        if (parameter == null && hasCurrentModel()) {
            parameter = currentModel.toParameter();
        }
    }

    @Override
    protected void translateCode() {

        final String parameterName = parameter == null ? "unknown" : parameter.getName();
        final List<Field> fields = getAllFields();
        code.addStatement("this(" + String.join("," + System.lineSeparator(), fields.stream().map(f -> {
            String get = f.needsCustomCode() ? MethodGetter.getCorrespondingGetterMethodName(f.getName(),
                                                                                             f.getType().isBoolean(),
                                                                                             false)
                                               + "()"
                                             : f.getName();
            if (f.getType().isBoolean() && f.getJavaDefaultBooleanValue() == false) {
                return parameterName + " != null && " + parameterName + "." + get;
            }
            return parameterName + " == null ? " + f.getJavaDefaultValue() + " : " + parameterName + "." + get;
        }).collect(Collectors.toList())) + ")");
    }

    @Override
    public List<String> getSignature() {
        final List<String> list = new LinkedList<>();
        list.add(parameter.getType().getShortName());
        return list;
    }

    @Override
    public List<Field> getFieldList() {
        return new ArrayList<>();
    }
}