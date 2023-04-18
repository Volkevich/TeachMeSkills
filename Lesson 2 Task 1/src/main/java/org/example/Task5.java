package org.example;

import java.util.Scanner;

public class Task5 {
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
