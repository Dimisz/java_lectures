package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Cady");
        names.add("Jack");
        names.add("Mike");
        names.add("Peter");

        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
//            System.out.println(iterator.next());
        }
        System.out.println(names.isEmpty());
    }
}
