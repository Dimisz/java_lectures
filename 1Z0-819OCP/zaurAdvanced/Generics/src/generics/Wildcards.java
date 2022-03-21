package generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
        List<?> list = new ArrayList<String>();
//        list.add("Hello");

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Hi");
        list2.add("There");
        list2.add("Howdy");
        showListInfo(list2);

        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(10.1);
        doubles.add(3.14);
        doubles.add(1.1);
        doubles.add(20.20);
        System.out.println(doubles);
        System.out.println("The sum is: " + sum(doubles));

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(3);
        integers.add(1);
        integers.add(20);
        System.out.println(integers);
        System.out.println("The sum is: " + sum(integers));
    }

    static void showListInfo(List<?> list){
        System.out.println("The list contains the following elements: " + list);
    }

    public static double sum(ArrayList<? extends Number> list){
        double sum = 0;
        for(Number n : list){
            sum += n.doubleValue();
        }
        return sum;
    }
}
