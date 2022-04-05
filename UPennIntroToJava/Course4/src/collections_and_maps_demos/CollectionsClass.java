package collections_and_maps_demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CollectionsClass {
    /**
     * takes a given range and removes elements in the range min through max inclusive
     * @param list - list of values
     * @param min - min of range
     * @param max - max of range
     *            examines the use of iterator
     */
    public static void removeRange(ArrayList<Integer> list, int min, int max){
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer next = iterator.next();
            if(next >= min && next <= max){
                iterator.remove();
            }
        }
    }

    /**
     * takes a given list and adds a star in the beginning and at the end
     * @param list
     */
    public static void addStars(ArrayList<String> list){
        String[] array = list.toArray(new String[list.size()]);
        //empty original ArrayList
        list.removeAll(Arrays.asList(array));

        // add stars and values back into original arrayList
        list.add("*");
        for(String s : array){
            list.add(s);
            list.add("*");
        }
    }
    public static void main(String[] args) {
        Integer[] removeRangeArray = {7, 9, 4, 2, 7, 7, 5, 3, 5, 1, 7, 8, 6, 7};
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(removeRangeArray));
        System.out.println("Original list: " + list);
        CollectionsClass.removeRange(list, 5, 7);
        System.out.println("After removing elements: " + list);


        // addStars
        String[] addStar = {"the", "quick", "brown", "fox"};
        // add all items in array to ArrayList
        ArrayList<String> sList = new ArrayList<>();
        sList.addAll(Arrays.asList(addStar));
        System.out.println("Before adding stars: " + sList);
        CollectionsClass.addStars(sList);
        System.out.println("After adding stars: " + sList);

    }
}
