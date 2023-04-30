package org.example;

import java.util.Scanner;

public class ClassWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Вводим координаты центра круга и радиус
        System.out.print("Введите координату x центра круга: ");
        double a = sc.nextDouble();
        System.out.print("Введите координату y центра круга: ");
        double b = sc.nextDouble();
        System.out.print("Введите радиус круга: ");
        double r = sc.nextDouble();

        // Вводим координаты точки
        System.out.print("Введите координату x точки: ");
        double x = sc.nextDouble();
        System.out.print("Введите координату y точки: ");
        double y = sc.nextDouble();

        // Вычисляем расстояние от точки до центра круга
        double distance = Math.sqrt(Math.pow(x-a, 2) + Math.pow(y-b, 2));

        // Проверяем, лежит ли точка внутри круга
        if(distance <= Math.pow(r, 2)) {
            System.out.println("Точка (" + x + ", " + y + ") лежит внутри круга.");
        } else {
            System.out.println("Точка (" + x + ", " + y + ") не лежит внутри круга.");
        }

        sc.close();
    }
}

