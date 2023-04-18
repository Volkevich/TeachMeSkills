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
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите целое число: ");
            int num = scanner.nextInt();
            if (isPrime(num) ) {
                String reversNumb = new StringBuilder(String.valueOf(num)).reverse().toString();
                System.out.println("Ваше число в обратном порядке - " + reversNumb);
            } else {
                System.out.println("Ошибка!\nВведенное число не является целым!");
            }
        }catch (NumberFormatException e){
            e.printStackTrace();
        }


    }
    public static boolean isPrime(final int number) {
        return IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
    }
}
