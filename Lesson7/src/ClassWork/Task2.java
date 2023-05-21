package ClassWork;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    /**
     * Сложная (6 баллов)
     *
     * Результаты спортсмена на соревнованиях в прыжках в высоту представлены строкой вида
     * "220 + 224 %+ 228 %- 230 + 232 %%- 234 %".
     * Здесь + соответствует удачной попытке, % неудачной, - пропущенной.
     * Высота и соответствующие ей попытки разделяются пробелом.
     * Прочитать строку и вернуть максимальную взятую высоту (230 в примере).
     * При нарушении формата входной строки, а также в случае отсутствия удачных попыток,
     * вернуть -1.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите результаты спортсмена: ");
        String input = in.nextLine();
        int maxJump = getMaxHeight(input);
        if (maxJump == -1) {
            System.out.println("Некоректный ввод данных");
        } else {
            System.out.println("Максимальная высота: " + maxJump);
        }
    }

    public static int getMaxHeight(String input) {
        int maxHeight = -1;

        if(!input.matches("(\\d+ [+%-]+ )*(\\d+ [+%-]+)")){
            return maxHeight;
        }

        Pattern pattern = Pattern.compile("(\\d+) ([+%-]+)");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            int height = Integer.parseInt(matcher.group(1));
            String result = matcher.group(2);

            if (result.contains("+") && height > maxHeight) {
                maxHeight = height;
            }
        }

        return maxHeight;
    }
}
