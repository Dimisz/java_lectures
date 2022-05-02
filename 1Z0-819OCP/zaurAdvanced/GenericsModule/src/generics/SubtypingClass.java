package generics;

import java.util.ArrayList;
import java.util.List;

public class SubtypingClass {
    public static void main(String[] args) {
//        X x = new Y();
//        List<X> list1 = new ArrayList<X>();
        // List<X> list1 = new ArrayList<Y>(); - cannot

        List<Number> list = new ArrayList<>();
    }
}

class X {

}

class Y extends X {

}
