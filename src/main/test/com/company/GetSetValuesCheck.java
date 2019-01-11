package com.company;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GetSetValuesCheck {

        @Test
        public void interchangeValuesSuccess() {
            GetSetValues getSetValues = new GetSetValues();
            Map<String, String> inputMap=new HashMap<>();
            inputMap.put("val1","java");
            inputMap.put("val2","c++");
            Map<String, String> expectedMapValues = new HashMap<>();
            expectedMapValues.put("val1", " ");
            expectedMapValues.put("val2", "java");
            Map<String, String> actualMapValues   = getSetValues.interchangeValues(inputMap);

            assertTrue(expectedMapValues.equals(actualMapValues));
        }


    @Test
    public void interchangeValuesFailure() {
        GetSetValues getSetValues = new GetSetValues();
        Map<String, String> inputMap=new HashMap<>();
        inputMap.put("val1","java");
        inputMap.put("val2","c++");
        Map<String, String> expectedMapValues = new HashMap<>();
        expectedMapValues.put("val1", "java");
        expectedMapValues.put("val2", "c++");
        Map<String, String> actualMapValues   = getSetValues.interchangeValues(inputMap);

        assertFalse(expectedMapValues.equals(actualMapValues));
    }
}
