package org.example;

import java.util.Scanner;

public class Task5 {
    /**
     * Тривиальная (3 балла).
     *
     * Задача имеет повышенную стоимость как первая в списке.
     *
     * Пользователь задает время в часах, минутах и секундах, например, 8:20:35.
     * Рассчитать время в секундах, прошедшее с начала суток (30035 в данном случае).
     */
    public static void main(String[] args) {
        System.out.println("Введите количество часов: ");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        System.out.println("Введите количество минут: ");
        int minutes = scanner.nextInt();
        System.out.println("Введите количество секунд: ");
        int seconds = scanner.nextInt();

        int totalSeconds = hours * 3600 + minutes * 60 + seconds;
        System.out.printf("Время в секундах, прошедшее с начала суток: %d", totalSeconds);
    }

}
