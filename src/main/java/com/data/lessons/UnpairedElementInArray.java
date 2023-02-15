package com.data.lessons;

import java.util.Arrays;

public class UnpairedElementInArray {

    public static void main (String[] args) {
        int[] array = {10, 1, 10, 11, 11, 89, 89};
        Arrays.sort(array);
        findOddNumber(array);
    }

    private static int findOddNumber(int[]array) {

        int i = 0;
        int arrayLenght = array.length - 1;
        Integer oddNumber = null;

        while(i <= arrayLenght){
            if(i == arrayLenght){
                oddNumber = array[i];
                break;
            } else if(array[i] == array[i+1]){
                i += 2;
            } else {
                oddNumber = array[i];
                break;
            }
        }
        System.out.printf("Odd number is: %s", oddNumber);
        return oddNumber;
    }
}
