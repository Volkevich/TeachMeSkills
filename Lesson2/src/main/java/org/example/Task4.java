package org.example;

import java.util.Scanner;

public class Task4 {
    /**
     * Тривиальная (1 балл)
     *
     * Найти длину отрезка, соединяющего точки на плоскости с координатами (x1, y1) и (x2, y2).
     * Например, расстояние между (3, 0) и (0, 4) равно 5
     */
    public static void main(String[] args) {
        System.out.println("Введите значение x1: ");
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        System.out.println("Введите значение y1: ");
        int y1 = scanner.nextInt();
        System.out.println("Введите значение x2: ");
        int x2 = scanner.nextInt();
        System.out.println("Введите значение y2: ");
        int y2 = scanner.nextInt();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("Расстояние между точками (%d, %d) и (%d, %d) равно %.2f", x1, y1, x2, y2, distance);
    }
}


