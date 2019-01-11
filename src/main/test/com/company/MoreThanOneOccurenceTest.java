package com.company;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MoreThanOneOccurenceTest {
    @Test
    public void checkOccurencesSuccess() {
        MoreThanOneOccurence frequencyMap = new MoreThanOneOccurence();
        String[] inputArray = {"a", "b", "c", "d", "a", "c", "c"};
        Map<String, Boolean> expectedMap = new HashMap<String, Boolean>();
        expectedMap.put("a", true);
        expectedMap.put("b", false);
        expectedMap.put("c", true);
        expectedMap.put("d", false);
        Map<String, Boolean> resultingMap = frequencyMap.occursMoreThanOnce(inputArray);

        assertTrue("checkFrequency is failing", expectedMap.equals(resultingMap));
    }


    @Test
    public void checkOccurencesFailure() {
        MoreThanOneOccurence frequencyMap = new MoreThanOneOccurence();
        String[] inputArray = {"a", "b", "c", "d", "a", "c", "c"};
        Map<String, Boolean> expectedMap = new HashMap<String, Boolean>();
        expectedMap.put("a", false);
        expectedMap.put("b", false);
        expectedMap.put("c", true);
        expectedMap.put("d", false);
        Map<String, Boolean> resultingMap = frequencyMap.occursMoreThanOnce(inputArray);

        assertFalse("checkOccurencesFailure test ", expectedMap.equals(resultingMap));
    }

}