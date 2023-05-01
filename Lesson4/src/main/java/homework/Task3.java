package homework;

public class Task3 {
    /**
     * Средняя (3 балла)
     *
     * Для заданного числа n определить, содержит ли оно различающиеся цифры.
     * Например, 54 и 323 состоят из разных цифр, а 111 и 0 из одинаковых.
     *
     * Использовать операции со строками в этой задаче запрещается.
     */
        public static void main(String[] args) {
            int n = 1111434;
            boolean hasDifferentDigits = false;
            int lastDigit = n % 10;
            n /= 10;

            while (n > 0) {
                int currentDigit = n % 10;
                if (currentDigit != lastDigit) {
                    hasDifferentDigits = true;
                    break;
                }
                lastDigit = currentDigit;
                n /= 10;
            }

            if (hasDifferentDigits) {
                System.out.println("Заданное число содержит различающиеся цифры.");
            } else {
                System.out.println("Заданное число не содержит различающихся цифр.");
            }
        }
    }


