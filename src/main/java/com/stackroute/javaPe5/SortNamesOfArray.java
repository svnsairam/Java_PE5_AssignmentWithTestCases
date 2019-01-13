/*
Write a program to implement set interface which sorts the given randomly ordered names in
ascending order. Convert the sorted set in to an array list
Input : Harry Olive Alice Bluto Eugene
Output :
Sorted Set : Alice Bluto Eugene Harry Olive
Array list from Set : Alice Bluto Eugene Harry Olive
 */
package com.stackroute.javaPe5;

import java.util.*;

public class SortNamesOfArray {
    public ArrayList<String> sortArrayOfNames(String[] inputString) {
        ArrayList<String> resultingArrayList = new ArrayList<>();
        if (inputString == null)
            return null;
        // Using the collections.sort method to sord the strings which are added to ArrayList
        for (int i = 0; i < inputString.length; i++) {
            resultingArrayList.add(inputString[i]);
        }
        Collections.sort(resultingArrayList);
        return resultingArrayList;
    }
}
