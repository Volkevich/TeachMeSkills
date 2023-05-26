import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TestClass2 {
    private static List<Integer> arrayListOne = new ArrayList<>();
    private static List<Integer> linkedList = new LinkedList<>();

    public static void main(String[] args) {
        addNumberArrayList(1000000);
        addNumberLinkedList(1000000);
        randomNumberArrayList(100000);
        randomNumberLinkedList(100000);
    }

    public static void addNumberArrayList(int number) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < number; i++) {
            arrayListOne.add(i);
        }
        System.out.println("Время добавления в ArrayList: " + (System.currentTimeMillis() - startTime) + " мс");
    }

    public static void addNumberLinkedList(int number) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < number; i++) {
            linkedList.add(i);
        }
        System.out.println("Время добавления в LinkedList: " + (System.currentTimeMillis() - startTime) + " мс");
    }

    public static void randomNumberArrayList(int number) {
        long startTime = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            int index = random.nextInt(arrayListOne.size());
            arrayListOne.get(index);
        }
        System.out.println("Время выборки из ArrayList: " + (System.currentTimeMillis() - startTime) + " мс");
    }

    public static void randomNumberLinkedList(int number) {
        long startTime = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            int index = random.nextInt(linkedList.size());
            linkedList.get(index);
        }
        System.out.println("Время выборки из LinkedList: " + (System.currentTimeMillis() - startTime) + " мс");
    }
}
