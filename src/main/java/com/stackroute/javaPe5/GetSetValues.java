/*
Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
Modify and return the given map as follows:
a. If the key `val1` has
b. Set the key `val1` to
Example 1:
The map {"val1": "java",
"java"}
Example 2:
The map {"val1": "mars",
"mars"}
a value, set the key `val2` to have that value, and
have the value `" "` (empty string ).
"val2": "c++"} should return {"val1": " ", "val2":
"val2": "saturn"}
should return {"val1": " ", "val2":
 */

package com.stackroute.javaPe5;

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
