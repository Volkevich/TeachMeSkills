import java.util.ArrayList;

public class TestClass<T, K> {
    private T name;
    private K age;
    private int number;

    public TestClass() {
    }
    public T getName() {
        return name;
    }
    public K getAge() {
        return age;
    }
    public void setName(T name) {
        this.name = name;
    }
    public void setAge(K age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "TestClass{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }

}
