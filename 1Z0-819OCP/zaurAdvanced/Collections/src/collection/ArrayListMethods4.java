package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods4 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");


        //Arrays.asList(DataType[]) -> List<DataType>
        StringBuilder[] array = {sb1, sb2, sb3, sb4};
        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list);

        array[0].append("!!!");
        System.out.println(list);

        array[0] = new StringBuilder("F");
        System.out.println(list);


        // removeAll(Collection<?> c)
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Cady");
        arrayList1.add("Vladimir");
        arrayList1.add("John");
        arrayList1.add("Cady");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("Cady");
        arrayList2.add("John");
        arrayList2.add("Jack");
        System.out.println(arrayList2);

//        arrayList1.removeAll(arrayList2);
//        System.out.println(arrayList1);

        // retainAll(Collection<?> c)
//        arrayList1.retainAll(arrayList2);
//        System.out.println(arrayList1);

        // containsAll
        boolean result = arrayList1.containsAll(arrayList2);
        System.out.println(result);

        //subList(int fromIndex, int toIndex)
        List<String> slice = arrayList1.subList(0, 2);
        System.out.println(slice);
        slice.add("Peter");
        System.out.println(arrayList1);


        // toArray
        Object[] arr = arrayList1.toArray();
        String[] arr1 = arrayList1.toArray(new String[arrayList1.size()]);

        for(String s : arr1){
            System.out.println(s);
        }


        // List.of(E...elements) -> List<E>
        List<Integer> nums1 = List.of(3, 8, 13);
        System.out.println(nums1);
//        nums1.add(100);// CANNOT BE MODIFFIED

        // List.copyOf(Collection<?> c) -> unmodifiable list
        List<Integer> nums2 = List.copyOf(nums1);
        System.out.println(nums2);
    }
}
