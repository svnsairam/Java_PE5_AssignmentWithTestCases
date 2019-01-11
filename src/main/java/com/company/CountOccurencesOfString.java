package com.company;

import java.util.HashMap;
import java.util.Map;

public class CountOccurencesOfString {
    public Map<String, Integer> numberOfOccerencesCounts(String inputString) {
        String wordsOnly = inputString.replaceAll("[@*-_]+", " ");
        String[] splitWordsArray = wordsOnly.split(" ");
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < splitWordsArray.length; i++) {
            if (map.containsKey(splitWordsArray[i])) {
                map.put(splitWordsArray[i], map.get(splitWordsArray[i]) + 1);
            } else {
                map.put(splitWordsArray[i], 1);
            }
        }
        return map;
    }
}
