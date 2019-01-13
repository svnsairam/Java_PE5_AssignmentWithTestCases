/*
Write a program where an array of strings is input and output is a Map< String ,boolean> where
each different string is a key and its value is true if that string appears 2 or more times in the array
Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
Output - {“a” : true,”b” :false ,”c” :true,”d” : false}
 */
package com.stackroute.javaPe5;

import java.util.HashMap;
import java.util.Map;

public class MoreThanOneOccurence {
    public Map<String, Boolean> occursMoreThanOnce(String[] stringArray) {
        Map<String, Boolean> map = new HashMap<>();
        // store the strings in map and for first occurence of string the value is false and
        // next time it will be true.
        for (int i = 0; i < stringArray.length; i++) {
            if (map.containsKey(stringArray[i]))
                map.put(stringArray[i], true);
            else
                map.put(stringArray[i], false);
        }
        return map;
    }
}
