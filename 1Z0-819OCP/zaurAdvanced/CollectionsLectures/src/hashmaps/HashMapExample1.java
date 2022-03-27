package hashmaps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Vladimir Solovyov");
        map1.put(1100, "John Doe");
        map1.put(1200, "Mike Tyson");
        map1.put(1300, "Michael Jackson");
        map1.put(1400, "Michael Jackson");
//        map1.put(1100, "Jane Doe");
//        map1.put(null, "Mo Yang");
//        map1.put(85214, null);
        map1.putIfAbsent(1400, "Marty Friedman");
        System.out.println(map1);

        System.out.println(map1.get(1000));

        map1.remove(1400);
        System.out.println(map1);

        System.out.println(map1.containsValue("Vladimir Solovyov"));

        System.out.println(map1.containsKey(500));
        System.out.println(map1.containsKey(1200));

        System.out.println(map1.keySet());

        System.out.println(map1.values());

        Map<String, String> fullNames = new HashMap<>();
        fullNames.put("Alex", "the Great");
        fullNames.put("Mike", "Tyson");
        System.out.println(fullNames);
    }

}
