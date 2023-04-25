package org.example;

import java.util.*;
import java.util.stream.IntStream;

public class Task1 {
    /**
     * Простая (2 балла)
     * <p>
     * Пользователь задает целое трехзначное число (например, 478).
     * Необходимо вывести число, полученное из заданного перестановкой цифр в обратном порядке (например, 874).
     */
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите целое трехзначное число: ");
            int num = scanner.nextInt();
            if (isPrime(num) ) {
                String result = new StringBuilder(String.valueOf(num)).reverse().toString();
                System.out.println("Ваше число в обратном порядке - " + result);
            }
    }

    public static boolean isPrime(final int number) {
        return IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
    }




}
