import java.util.regex.Pattern;

public class Main {
    /*
     * * Сложная (6 баллов)
     *
     * В строке представлено выражение вида "2 + 31 - 40 + 13",
     * использующее целые положительные числа, плюсы и минусы, разделённые пробелами.
     * Наличие двух знаков подряд "13 + + 10" или двух чисел подряд "1 2" не допускается.
     * Вернуть значение выражения (6 для примера).
     * Про нарушении формата входной строки бросить исключение IllegalArgumentException
     */
    public static void main(String[] args) {
        String line = "2 + 31 - 40 + 13";
        if (isValidExpression(line)){
            int result = evaluateExpression(line);
            System.out.println("Результат выражения: " + result);
        }else throw new IllegalArgumentException("Некорректный формат строки");


    }

    public static int evaluateExpression(String expression) {
        String[] tokens = expression.split("\\s+");
        int sum = Integer.parseInt(tokens[0]);

        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            int number = Integer.parseInt(tokens[i + 1]);

            if (operator.equals("+")) {
                sum += number;
            } else if (operator.equals("-")) {
                sum -= number;
            } else {
                throw new IllegalArgumentException("Некорректный оператор: " + operator);
            }
        }
        return sum;
    }
    public static boolean isValidExpression(String input) {
        String regex = "\\d+(\\s+[-+]\\s+\\d+)*";
        return Pattern.matches(regex, input);
    }
}
