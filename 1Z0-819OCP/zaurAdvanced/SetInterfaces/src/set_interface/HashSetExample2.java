package set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args) {
        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(2);
        intSet.add(3);
        intSet.add(1);
        intSet.add(5);
        intSet.add(8);

        HashSet<Integer> intSet2 = new HashSet<>();
        intSet2.add(7);
        intSet2.add(4);
        intSet2.add(5);
        intSet2.add(3);
        intSet2.add(8);

        HashSet<Integer> unionSet = new HashSet<>(intSet);
        unionSet.addAll(intSet2);
        System.out.println(unionSet);

        HashSet<Integer> intersectSet = new HashSet<>(intSet);
        intersectSet.retainAll(intSet2);
        System.out.println(intersectSet);

        HashSet<Integer> subtractSet = new HashSet<>(intSet);
        subtractSet.removeAll(intSet2);
        System.out.println(subtractSet);

    }
}
