/*
Write a program to find the number of counts in the following String . Store the output in
Map< String ,Integer> as key value pair.
Input : String str = “one one -one___two,,three,one @three*one?two”;
Output : {"one":5 , "two":2, "three" :2}
 */
package com.stackroute.javaPe5;

import java.util.HashMap;
import java.util.Map;

public class CountOccurencesOfString {
    public Map<String, Integer> numberOfOccerencesCounts(String inputString) {
        // removing the symbols inorder to get only words
        String wordsOnly = inputString.replaceAll("[@*-_]+", " ");
        String[] splitWordsArray = wordsOnly.split(" ");
        Map<String, Integer> map = new HashMap<String, Integer>();
        // adding each word one at a time and increasing the count.
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
