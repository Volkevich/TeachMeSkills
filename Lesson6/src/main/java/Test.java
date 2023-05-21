import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        String romanNumeral = convertToRoman(number);
        System.out.println(number + " в римской системе: " + romanNumeral);
    }

    public static String convertToRoman(int number) {

        int[] arabicValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        String romanNumeral = "";

        int i = 0;
        while (number > 0) {
            if (number >= arabicValues[i]) {
                romanNumeral += romanSymbols[i];
                number -= arabicValues[i];
            } else {
                i++;
            }
        }

        return romanNumeral;
    }
}
