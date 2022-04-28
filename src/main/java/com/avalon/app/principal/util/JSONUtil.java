package com.avalon.Avalon.Util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Converter;
import java.io.IOException;

public class JSONUtil {
    private static final ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();
    }

    public static String convertJavaToJson(Object obj) {
        String resultAsJSON= "";
        try {
            resultAsJSON= mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return resultAsJSON;
    }

    public static <T> T convertJsonToJava(MultipartFile file, Class<T> cls) {
        T resultAsJavaObject = null;
        try {
            resultAsJavaObject= mapper.readValue(file.getBytes(), cls);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultAsJavaObject;
    }
}
