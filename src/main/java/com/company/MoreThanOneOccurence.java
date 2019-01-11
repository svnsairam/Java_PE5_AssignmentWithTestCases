package com.company;

import java.util.HashMap;
import java.util.Map;

public class MoreThanOneOccurence {


    public Map<String, Boolean> occursMoreThanOnce(String[] stringArray) {
        Map<String, Boolean> map = new HashMap<>();
        for (int i = 0; i < stringArray.length; i++) {
            if (map.containsKey(stringArray[i]))
                map.put(stringArray[i], true);
            else
                map.put(stringArray[i], false);
        }
        return map;
    }
}
