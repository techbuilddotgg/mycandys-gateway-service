package com.feri.mycandysgatewayservice.utils;

public class ApplicationPropertiesParser {

    public static String[] parseMultipleValues(String value) {
        String[] values = value.split(",");
        for (int i = 0; i < values.length; i++) {
            values[i] = values[i].trim();
        }
        return values;
    }
}
