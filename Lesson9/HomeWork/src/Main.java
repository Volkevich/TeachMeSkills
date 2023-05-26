public class Main {
    public static void main(String[] args) {
        TestClass<String,Integer> testClass = new TestClass<String,Integer>();
        testClass.setAge(123);
        testClass.setName("Ivan");
        String string = testClass.toString();
        System.out.println(string);

    }
}