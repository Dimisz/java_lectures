import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);

        addInOrder(placesToVisit, "Alice Springs");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);
        visit(placesToVisit);

//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Canberra");
//        placesToVisit.add("Darwin");

//        printList(placesToVisit);
//
//        placesToVisit.add(1, "Alice Springs");
//        printList(placesToVisit);
//
//        placesToVisit.remove(4);
//        printList(placesToVisit);
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
//            else if(comparison < 0){
//                // move on to the next city
//            }
        }
        iter.add(newCity);
        return true;
    }

    private static void visit(LinkedList<String> list){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> iter = list.listIterator();
        if(list.isEmpty()){
            System.out.println("No cities in the itinerary");
        }
        else {
            System.out.println("Now visiting " + iter.next());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(iter.hasNext()){
                            iter.next();
                        }
                        goingForward = true;
                    }
                    if(iter.hasNext()){
                        System.out.println("Now visiting " + iter.next());
                    }
                    else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(iter.hasPrevious()){
                            iter.previous();
                        }
                        goingForward = false;
                    }
                    if(iter.hasPrevious()){
                        System.out.println("Now visiting " + iter.previous());
                    }
                    else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions:\npress ");
        System.out.println("0\t-\tto quit\n" +
                "1\t-\tgo to next city\n" +
                "2\t-\tgo to previous city\n" +
                "3\t-\tprint menu options");
    }

}
