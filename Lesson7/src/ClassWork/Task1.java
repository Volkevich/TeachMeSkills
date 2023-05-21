package ClassWork;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
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
        System.out.println("Введите результат спортсменов: ");
        String string = in.next();
        Pattern pattern = Pattern.compile("(\\d{3})(\\+|%{1,2}|\\-|)");
        Matcher matcher = pattern.matcher(string);
        if (matcher.find()){
            String group = matcher.group(0);
            System.out.println(group);
        }
    }
}
