package com.arm.pelion.sdk.foundation.generator.model;

import java.util.List;
import java.util.stream.Collectors;

import com.squareup.javapoet.CodeBlock;

public class MethodToString extends AbstractMethodBasedOnModel {

    public MethodToString(Model currentModel, Model parentModel) {
        super(currentModel, parentModel, false, "toString", "Returns a string representation of the object.",
              "@see java.lang.Object#toString()", false, true, false, false,
              currentModel == null ? false : currentModel.needsFieldCustomisation(), false, false, true);
        setReturnType(new ParameterType(String.class));
        setReturnDescription("the string representation");
        setCode(CodeBlock.builder());
    }

    /*
     * (non-Javadoc)
     *
     * @see com.arm.pelion.sdk.foundation.generator.model.Method#translateCode()
     */
    @Override
    protected void translateCode() {
        super.translateCode();
        code.addStatement("return " + generateFullString(currentModel, parentModel, extraFields()));
    }

    protected List<Field> extraFields() {
        return null;
    }

    private String generateFullString(Model currentModel, Model parentModel, List<Field> extraFields) {
        if (currentModel == null) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("\"").append(currentModel.getName()).append(" [");
        if (currentModel.hasFields()) {
            builder.append(generateFlattenedListOfElements(currentModel.getFieldList()));
        }
        if (parentModel != null && parentModel.hasFields()) {
            if (currentModel.hasFields()) {
                builder.append(" + \", ");
            }
            builder.append(generateFlattenedListOfElements(parentModel.getFieldList()));
            if (extraFields != null && !extraFields.isEmpty()) {
                builder.append(" + \", ");
                builder.append(generateFlattenedListOfElements(extraFields));
            }
            builder.append(" + \"]\"");
        } else {
            if (extraFields != null && !extraFields.isEmpty()) {
                if (currentModel.hasFields()) {
                    builder.append(" + \", ");
                }
                builder.append(generateFlattenedListOfElements(extraFields));
                builder.append(" + \"]\"");
            } else {
                if (currentModel.hasFields()) {
                    builder.append(" + \"]\"");
                } else {
                    builder.append("]\"");
                }
            }
        }
        return builder.toString();

    }

    protected String generateFlattenedListOfElements(List<Field> fields) {
        return fields == null ? "" : String.join(System.lineSeparator() + "+ \", ", fields.stream().map(f -> {
            return f.getName() + "=\" + " + f.getName();
        }).collect(Collectors.toList()));
    }
}
