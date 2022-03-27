package stack;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();
        names.push("Dimi");
        names.push("Michael");
        names.push("John");
        names.push("Kate");
        System.out.println(names);

        /*
        while(!names.isEmpty()){
            System.out.println(names.pop());
            System.out.println(names);
        }
        */
        for(int i = 0; i < 3; i++){
            System.out.println(names.peek()); // show element on top of the stackk
            System.out.println(names);
        }

    }
}
