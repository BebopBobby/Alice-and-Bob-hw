package dogs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DogTest {
    public static void main(String[] args) {
//        Map<String, Dog> dogMap = new HashMap<String, Dog>();
//
//        dogMap.put("One", new Dog("Spike"));
//        dogMap.put("Two", new Dog("Fido"));
//        dogMap.put("Three", new Dog("Gus"));

//        for(Map.Entry<String, Dog> d : dogMap.entrySet()){
//            System.out.println(d.getKey() + "===========" + d.getValue().name);
//        }

//        Map<Integer, String> studentMap = new HashMap<Integer, String>();
//
//        studentMap.put(1, "Derian");
//        studentMap.put(2, "Zach");
//        studentMap.put(3, "Bobby");
//        studentMap.put(4, "Troy");
//        studentMap.put(5, "Lamar");
//        studentMap.put(6, "Javon");
//        studentMap.put(7, "Zohdi");

//        for (Map.Entry<Integer, String> s: studentMap.entrySet()) {
//            System.out.println(s.getKey() + " ======= " + s.getValue());
//        }

        Map<Integer, String> a = new HashMap<Integer, String>();
        a.put(1, "value1");

        Map<Integer, String> b = new HashMap<Integer, String>();
        b.put(2, "value2");

        b.putAll(a);

        b.clear();

        System.out.println(b.isEmpty());

    }
}
