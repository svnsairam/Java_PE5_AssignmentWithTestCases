package com.stackroute.javaPe5;

import org.junit.Test;

import static org.junit.Assert.*;

public class UpdateArrayAndReplaceTest {
    UpdateArrayAndReplace updateArrayAndReplace;

    @org.junit.Before
    public void setUp() throws Exception {
        updateArrayAndReplace = new UpdateArrayAndReplace();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        updateArrayAndReplace = null;
    }

    @Test
    public void replaceArrayElement() {
        String[] arrayString = {"Apple", "Grape", "Melon", "Berry"};
        String element = "Apple";
        String replaceingString = "Kiwi";
        String[] expectedArray = {"Kiwi", "Grape", "Melon", "Berry"};
        String[] resultingArray = updateArrayAndReplace.replaceArrayElement(arrayString, element, replaceingString);
        assertArrayEquals("UpdateArray is failing", expectedArray, resultingArray);
    }

    @Test
    public void replaceArrayElementFailure() {
        String[] arrayString = {"Apple", "Grape", "Melon", "Berry"};
        String element = "Apple";
        String replaceingString = "Kiwi1";
        String[] expectedArray = {"Kiwi", "Grape", "Melon", "Berry"};
        String[] resultingArray = updateArrayAndReplace.replaceArrayElement(arrayString, element, replaceingString);
        assertFalse(expectedArray.equals(resultingArray));
    }

    @Test
    public void clearArray() {
        String[] inputArray = {"Apple", "Grape", "Melon", "Berry"};
        String[] resultingArray = updateArrayAndReplace.clearArray(inputArray);

        assertNull("clearArray is failing", resultingArray);
    }

    @Test
    public void replaceArrayElementEmptyArray() {
        String[] arrayString = {};
        String element = "Apple";
        String replaceingString = "Kiwi";
        String[] expectedArray = {};
        String[] resultingArray = updateArrayAndReplace.replaceArrayElement(arrayString, element, replaceingString);
        assertArrayEquals("UpdateArray is failing", expectedArray, resultingArray);
    }

    @Test
    public void ReplaceingStringDoesnMatch() {
        String[] arrayString = {"Apple", "Grape", "Melon", "Berry"};
        String element = "banana";
        String replaceingString = "Kiwi";
        String[] expectedArray = {"Apple", "Grape", "Melon", "Berry"};
        String[] resultingArray = updateArrayAndReplace.replaceArrayElement(arrayString, element, replaceingString);
        assertArrayEquals("UpdateArray is failing", expectedArray, resultingArray);
    }

    @Test
    public void ReplaceingStringIsNull() {
        String[] arrayString = {"Apple", "Grape", "Melon", "Berry"};
        String element = "Apple";
        String replaceingString = null;
        String[] expectedArray = {"", "Grape", "Melon", "Berry"};
        String[] resultingArray = updateArrayAndReplace.replaceArrayElement(arrayString, element, replaceingString);
        assertArrayEquals("UpdateArray is failing", expectedArray, resultingArray);
    }

}