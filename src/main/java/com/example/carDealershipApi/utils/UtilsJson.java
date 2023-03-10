package com.example.carDealershipApi.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringWriter;

public class UtilsJson {
    public static String objToStringJson(Object object) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        StringWriter writer = new StringWriter();
        mapper.writeValue(writer, object);
        return writer.toString();
    }
}
