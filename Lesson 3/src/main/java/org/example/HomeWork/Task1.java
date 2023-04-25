package org.example.HomeWork;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[] arrays = {1,2,3,4,5,6,7,7,8,9,11,33};
        minAndMaxArray(arrays);
    }

    private static void minAndMaxArray(int[] array) {

        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        int temp = array[maxIndex];
        array[maxIndex] = array[minIndex];
        array[minIndex] = temp;

        System.out.println("Исходный массив: " + Arrays.toString(new int[]{1,2,3,4,5,6,7,7,8,9,11,33}));
        System.out.println("Измененный массив: " + Arrays.toString(array));
    }


}
