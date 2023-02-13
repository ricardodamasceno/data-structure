package com.data.mergesort;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = {10, 8, 1, 89, 85, 974, 895621, 2, 56, 96};
        System.out.println("Printing array items before sorting");
        printArray(array);
        mergeSort(array);
        System.out.println("Printing array items after sorting");
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.println("array value: " + value);
        }
    }

    private static void mergeSort(int[] array) {

        int arrayLenght = array.length;

        if (arrayLenght < 2) {
            return;
        }

        int half = arrayLenght / 2;
        int[] leftHalf = new int[half];
        int[] rightHalf = new int[arrayLenght - half];

        for (int i = 0; i < leftHalf.length; i++) {
            leftHalf[i] = array[i];
        }

        for (int i = half; i < arrayLenght; i++) {
            rightHalf[i - half] = array[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(array, leftHalf, rightHalf);

    }

    private static void merge(int[] array, int[] leftHalf, int[] rightHalf) {

        int i = 0, j = 0, k = 0;
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                array[k] = leftHalf[i];
                i++;
            } else {
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            array[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            array[k] = rightHalf[j];
            j++;
            k++;
        }
    }

}
