import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    /*
     *
     * Сложная (6 баллов)
     *
     * Строка содержит названия товаров и цены на них в формате вида
     * "Хлеб 39.9; Молоко 62; Курица 184.0; Конфеты 89.9".
     * То есть, название товара отделено от цены пробелом,
     * а цена отделена от названия следующего товара точкой с запятой и пробелом.
     * Вернуть название самого дорогого товара в списке (в примере это Курица),
     * или пустую строку при нарушении формата строки.
     * Все цены должны быть больше нуля либо равны нулю.
     * В случае неверной строки выкинуть свое исключение.
     */
    public static void main(String[] args) throws Exception {

        searchMaxPrice();
    }

    private static void searchMaxPrice() throws MyException {
        String line = "Хлеб 233.9; Молоко 622; Курица 222.0; Конфеты 89.9;";
        String regex = "([А-Яа-я]+) ([\\d.]+);";
        double maxPrice = 0.0;
        String maxProduct = "";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);

        if (matcher.find()) {
            String[] lineText = line.split(";");
            for (String l : lineText) {
                String[] textArray = l.trim().split(" ");
                if (Double.parseDouble(textArray[1]) > maxPrice) {
                    maxPrice = Double.parseDouble(textArray[1]);
                    maxProduct = textArray[0];
                }
            }
            System.out.println(maxProduct + " стоимостью " + maxPrice);
        } else {
            throw new MyException("Ошибка!");
        }
    }

}