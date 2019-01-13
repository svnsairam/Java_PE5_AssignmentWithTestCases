package com.stackroute.javaPe5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetSetValues {
    public static Map<String, String> interchangeValues(Map<String, String> inputMap) {
        String val1 = inputMap.get("val1");
        if (val1 != null || val1 != "") {
            inputMap.put("val1", " ");
            inputMap.put("val2", val1);
        }
        return inputMap;
    }
}
