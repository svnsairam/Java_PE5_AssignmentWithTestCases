/*
Write a Java program to update specific array element by given element and empty the array list .
Input: [Apple, Grape, Melon, Berry]
Output: [Kiwi, Grape, Mango, Berry]
Array list after removing all elements []
 */
package com.stackroute.javaPe5;

public class UpdateArrayAndReplace {
    public String[] replaceArrayElement(String[] arrayString, String replaceElement, String replaceString) {
        if (replaceString == null)
            replaceString = "";
        if (arrayString.length == 0)
            return arrayString;
        // finding the correct matching word and then replacing it the original string with replaceElement
        for (int i = 0; i < arrayString.length; i++) {
            if (arrayString[i].equals(replaceElement)) {
                arrayString[i] = replaceString;
                break;
            }
        }
        return arrayString;
    }

    public String[] clearArray(String[] StringArray) {
        StringArray = null;
        return StringArray;
    }
}