package queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Dimi");
        queue.add("John");
        queue.add("Mary");
        queue.offer("Kate"); // used when limited size
        System.out.println(queue);

        /*
        System.out.println(queue.remove());
        System.out.println(queue.element()); // elt first in queue
        System.out.println(queue.remove());

        System.out.println(queue.element());
        System.out.println(queue);
        System.out.println(queue.remove());

        System.out.println(queue.element());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.poll());
        //unlike remove doesn't throw exception if queue is empty
        System.out.println(queue.peek()); //unlike element doesn't throw exception
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        */
        queue.remove("Mary");
        // possible but in that case one should reconsider using queue
        System.out.println(queue);
    }
}
