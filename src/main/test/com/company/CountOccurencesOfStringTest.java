package com.company;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountOccurencesOfStringTest {

    @Test
    public void numberOfOccerencesCountsSuccess() {
        CountOccurencesOfString countOccurencesOfString = new CountOccurencesOfString();
        String inputString = "one one -one___two,,three,one @three*one?two";
        Map<String, Integer> expectedMap = new HashMap<String, Integer>();
        expectedMap.put("one", 5);
        expectedMap.put("two", 2);
        expectedMap.put("three", 2);
        Map<String, Integer> resultingMap = countOccurencesOfString.numberOfOccerencesCounts(inputString);
        resultingMap.remove("");
        assertTrue("numberOfOccerencesCountsSuccess test ", expectedMap.equals(resultingMap));
    }

    @Test
    public void numberOfOccerencesCountsFailure() {
        CountOccurencesOfString countOccurencesOfString = new CountOccurencesOfString();
        String inputString = "one one -one___two,,three,one @three*one?two";
        Map<String, Integer> expectedMap = new HashMap<String, Integer>();
        expectedMap.put("one", 1);
        expectedMap.put("two", 2);
        expectedMap.put("three", 2);
        Map<String, Integer> resultingMap = countOccurencesOfString.numberOfOccerencesCounts(inputString);
        resultingMap.remove("");
        assertFalse("numberOfOccerencesCountsFailure test ", expectedMap.equals(resultingMap));
    }

}