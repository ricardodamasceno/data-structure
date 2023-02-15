package com.data.lessons;

import com.data.utils.StringUtils;

public class CyclicRotation {

    public static void main (String[] args) {
        int[] array = {1, 2, 3 , 4, 5};
        System.out.println("Array before rotation: " + StringUtils.printArray(array));
        rotateArray(array, 3);
        System.out.println("Array after rotation: " + StringUtils.printArray(array));
    }

    private static void rotateArray(int[] array, int rotateCount){

        if (array == null || array.length < 2){
            return;
        }

        int arraySize = array.length - 1;
        int i = 0, j = arraySize;
        int rotate = 0;

        while (rotate < rotateCount) {
            int aux = array[i];
            array[i] = array[j];
            array[j] = aux;
            i++;
            if(i == arraySize){
                rotate++;
                i = 0;
                j = arraySize;
            }
        }
    }
}
