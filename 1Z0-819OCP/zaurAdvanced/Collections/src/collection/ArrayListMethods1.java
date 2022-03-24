package collection;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Cady");
        arrayList1.add("Vladimir");
        arrayList1.add("John");
        arrayList1.add(1, "Peter"); // add to a particular index
        System.out.println(arrayList1);

//        for(String s: arrayList1){
//            System.out.println(s);
//        }


        // GET METHOD
//        for(int i = 0; i < arrayList1.size(); i++){
//            System.out.println(arrayList1.get(i));
//        }



        //  SET METHOD
        arrayList1.set(1, "Mark");
        System.out.println(arrayList1);


        // REMOVE USING INDEX
        arrayList1.remove(0);
        System.out.println(arrayList1);
    //    ArrayList<int> arrayList2 = new ArrayList<>(); // cannot use primitives
    }
}
