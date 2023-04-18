package org.example;

import java.util.Scanner;

public class Task3 {
    /**
     * Простая (2 балла)
     *
     * Пользователь задает целое число, больше или равно 100 (например, 3801).
     * Определить третью цифру справа в этом числе (в данном случае 8).
     */
    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();

        if (number >=100){
            int result = (number / 100) % 10;
            System.out.println("Третья цифра справа: - " + result);
        }

    }
}
