package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class SortNamesOfArrayTest {


    SortNamesOfArray sortNamesOfArray;

    @org.junit.Before
    public void setUp() throws Exception {
        sortNamesOfArray= new SortNamesOfArray();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        sortNamesOfArray=null;
    }
    @Test
    public void checkSortNamesEmptyArray()
    {
        String[] inputStringArray={};
        ArrayList<String> expectedValue=new ArrayList<>(Arrays.asList(new String[]{}));
        ArrayList<String> actualValue=sortNamesOfArray.sortArrayOfNames(inputStringArray);

        assertArrayEquals(expectedValue.toArray(),actualValue.toArray());
    }

    @Test
    public void checkSortNamesNull()
    {
        String[] inputStringArray=null;
        ArrayList<String> actualValue=sortNamesOfArray.sortArrayOfNames(inputStringArray);

        assertNull("checkSortNamesNull is failing ", actualValue);
    }

    @Test
    public void checkSortNamesSingleElement()
    {
        String[] inputStringArray={"Harry"};
        ArrayList<String> expectedValue=new ArrayList<>(Arrays.asList(new String[]{"Harry"}));
        ArrayList<String> actualValue=sortNamesOfArray.sortArrayOfNames(inputStringArray);

        assertArrayEquals(expectedValue.toArray(),actualValue.toArray());
    }

    @Test
    public void sortNamesSuccess() {
        String[] inputStringArray={"Harry", "Olive", "Alice", "Bluto", "Eugene"};
        ArrayList<String> expectedValue= new ArrayList<String>(Arrays.asList(new String[]{"Alice", "Bluto", "Eugene","Harry","Olive"}));
        ArrayList<String> actualValue=sortNamesOfArray.sortArrayOfNames(inputStringArray);

        assertArrayEquals("sort is failing", expectedValue.toArray(), actualValue.toArray());
    }

    @Test
    public void sortNamesFailure() {
        String[] inputStringArray={"Harry", "Olive", "Alice", "Bluto", "Eugene"};
        ArrayList<String> expectedValue= new ArrayList<String>(Arrays.asList(new String[]{"Bluto","Alice","Eugene","Harry","Olive"}));
        ArrayList<String> actualValue=sortNamesOfArray.sortArrayOfNames(inputStringArray);

        assertFalse(expectedValue.equals(actualValue));
    }




}