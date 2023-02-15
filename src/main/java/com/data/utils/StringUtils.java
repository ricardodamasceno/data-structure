package com.data.utils;

public class StringUtils {

    public static String printArray(int[]array){
        String printedArray = "";
        for(int position: array){
            printedArray += position + ", ";
        }
        printedArray = printedArray.substring(0, printedArray.lastIndexOf(","));
        return printedArray;
    }

}
