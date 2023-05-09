package homework;

import java.util.*;

public class Task4 {
    int age;
    String name;

    {
        age = 10;
        name = "ИВан";
    }

    /**
     * Простая (2 балла)
     * <p>
     * По заданному ассоциативному массиву "студент"-"оценка за экзамен" построить
     * обратный массив "оценка за экзамен"-"список студентов с этой оценкой".
     * <p>
     * Например:
     * buildGrades(mapOf("Марат" to 3, "Семён" to 5, "Михаил" to 5))
     * -> mapOf(5 to listOf("Семён", "Михаил"), 3 to listOf("Марат"))
     */
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Марат", 3);
        students.put("Семён", 5);
        students.put("Михаил", 5);
        Map<Integer, List<String>> grades = buildGrades(students);
        System.out.println(grades);
    }

    public static Map<Integer, List<String>> buildGrades(Map<String, Integer> grades) {
        Map<Integer, List<String>> studentMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            String students = entry.getKey();
            Integer score = entry.getValue();
            if (!studentMap.containsKey(score)) {
                studentMap.put(score, new ArrayList<>());
            }
            studentMap.get(score).add(students);
        }
        return studentMap;
    }

}
