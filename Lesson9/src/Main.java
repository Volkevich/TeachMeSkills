import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.<String>print(new String[]{"1","2","3"});

    }
}

class Printer{

    public <T> void print(T[] items){
        for(T item: items){
            System.out.println(item);
        }
    }
}


