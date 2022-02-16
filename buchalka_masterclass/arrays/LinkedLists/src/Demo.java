import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Darwin");

        printList(placesToVisit);

        placesToVisit.add(1, "Alice Springs");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> list){
        Iterator<String> i = list.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting: " + i.next());
        }
        System.out.println("====================");
    }

    private static boolean addInOrder(LinkedList<String> list, String newCity){
        ListIterator<String> iter = list.listIterator();

        while(iter.hasNext()){
            int comparison = iter.next().compareTo(newCity);
            if(comparison == 0){ //equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            }
            else if(comparison > 0){
                // newCity should appear before the current
                // Brisbaine -> Adelaide
                iter.previous();
                iter.add(newCity);
                return true;
            }
            else if(comparison < 0){
                // move on to the next city
            }
        }
        iter.add(newCity);
    }
}
