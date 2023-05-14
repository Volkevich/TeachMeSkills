public class HomeWork1 {
    /*
     * Найти в массиве самую длинную последовательность,
     *  состоящую из одинаковых элементов.
     * Вывести на экран количество элементов самой длиной
     *  последовательности и номер элемента, который является ее началом.*/
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5};
        int startIndex = 0;
        int countElements = 1;
        int maxStartIndex = 0;
        int maxLength = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]){
                countElements++;
            }else {
                countElements = 1;
                startIndex = i;
            }
            if (countElements > maxLength){
                maxLength = countElements;
                maxStartIndex = startIndex;
            }
        }

        System.out.println("Количество элементов самой длиной последовательности: " + maxLength);
        System.out.println("Номер элемента, который является ее началом: " + maxStartIndex);

    }


}

