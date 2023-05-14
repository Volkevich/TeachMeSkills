package org.example;

import java.util.Arrays;

public class Main {
    /**
     * Средняя (3 балла)
     *
     * В заданном списке list каждый элемент, кроме первого, заменить
     * суммой данного элемента и всех предыдущих.
     * Например: 1, 2, 3, 4 -> 1, 3, 6, 10.
     * Пустой список не следует изменять. Вернуть изменённый список.
     *
     * Обратите внимание, что данная функция должна изменять содержание списка list, а не его копии.
     */
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,7,9,10};

        System.out.println(Arrays.toString(getSumArray(arr)));


    }


    public static int[] getSumArray(int[] arr){
        if (arr.length == 0){
            return new int[0];
        }
        int [] res = new int[arr.length];
        int buffer = 0;
        for (int i = 0; i <arr.length ; i++) {
            buffer += arr[i];
            res[i] += buffer;

        }
        return res;
    }
}