package org.example;

import java.util.Scanner;

public class Task2 {
    /**
     * Простая (2 балла)
     * <p>
     * Человек положил в банк сумму в s рублей под p% годовых (проценты начисляются в конце года).
     * Сколько денег будет на счету через 3 года (с учётом сложных процентов)?
     * Например, 100 рублей под 10% годовых превратятся в 133.1 рубля
     */
    public static void main(String[] args) {
        System.out.println("Введите сумму депозита: ");
        Scanner scanner = new Scanner(System.in);
        double deposit = scanner.nextDouble();
        System.out.println("Сумма депозита - " + deposit + "$");
        System.out.println("Введите процентную ставку в процентах (например 10): ");
        double interest = scanner.nextDouble();
        System.out.println("Процентная ставка составляет - " + interest+ "%");
        System.out.println("Введите количества лет для депозита: ");
        int years = scanner.nextInt();


        double result = deposit * Math.pow(1 + interest / 100, years);
        System.out.printf("Сумма на счету через %d года: %.2f $", years, result);
    }

}
