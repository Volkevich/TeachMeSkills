import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<Long,String> phoneMobile = new HashMap<>();
        phoneMobile.put(12313213132132L,"Иван");
        phoneMobile.put(3754459949L,"Олег");
        phoneMobile.put(37544599969L,"Сергей");
        phoneMobile.put(37549979L,"Ваня");

        for (Map.Entry<Long,String> map:phoneMobile.entrySet()){
            if (map.getValue().equals("Олег")){
                System.out.println("Телефон Олега " + map.getKey());
            }
        }


    }
}




