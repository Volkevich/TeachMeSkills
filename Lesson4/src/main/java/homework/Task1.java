package homework;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    /**
     * Средняя (4 балла)
     * <p>
     * Дата представлена строкой вида "15 июля 2016".
     * Перевести её в цифровой формат "15.07.2016".
     * День и месяц всегда представлять двумя цифрами, например: 03.04.2011.
     * При неверном формате входной строки вернуть пустую строку.
     * <p>
     * Обратите внимание: некорректная с точки зрения календаря дата (например, 30.02.2009) считается неверными
     * входными данными.
     */
        public static void main(String[] args) {
            System.out.println("Введите дату: ");
            Scanner scanner = new Scanner(System.in);
            String date = scanner.nextLine();
            String regex = "(\\d{1,2})\\s+(январ[ья]|феврал[ья]|март[а]?|апрел[ья]|май[а]?|июн[ья]|июл[ья]|август[а]?|сентябр[ья]|октябр[ья]|ноябр[ья]|декабр[ья])\\s+(\\d{4})";
            if (date.matches(regex)) {
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("ru"));
                LocalDate localDate = LocalDate.parse(date, dateTimeFormatter);
                DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                System.out.println(localDate.format(outputFormatter));
            } else {
                System.out.println("Некорректный формат даты");
            }


        }
    }

