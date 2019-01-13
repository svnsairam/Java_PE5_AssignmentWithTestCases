package com.stackroute.javaPe5;

import java.util.*;

public class SortNamesOfArray {
    public ArrayList<String> sortArrayOfNames(String[] inputString) {
        ArrayList<String> resultingArrayList = new ArrayList<>();
        if (inputString == null)
            return null;
        for (int i = 0; i < inputString.length; i++) {
            resultingArrayList.add(inputString[i]);
        }
        Collections.sort(resultingArrayList);
        return resultingArrayList;
    }
}