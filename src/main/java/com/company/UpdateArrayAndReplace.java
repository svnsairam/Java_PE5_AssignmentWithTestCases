package com.company;

import java.util.ArrayList;
import java.util.List;

public class UpdateArrayAndReplace {
    public String[] replaceArrayElement(String[] arrayString, String replaceElement, String replaceString) {
        if (replaceString == null)
            replaceString = "";

        if (arrayString.length == 0)
            return arrayString;

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