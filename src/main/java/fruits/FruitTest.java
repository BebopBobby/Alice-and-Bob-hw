package fruits;

import java.util.ArrayList;
import java.util.Iterator;

public class FruitTest {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Strawberries");
        fruits.add("Bananas");
        fruits.add("Mangoes");

//        Iterator<String> x = fruits.iterator();
//        while(x.hasNext()){
//            String answer = x.next();
//            System.out.println(answer);
//        }

        for (String w:fruits) {
            System.out.println(w);
        }



    }
}
