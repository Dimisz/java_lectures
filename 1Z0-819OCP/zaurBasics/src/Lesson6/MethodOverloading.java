package Lesson6;

public class MethodOverloading {

    void show(int i1){
        System.out.println(i1);
        System.out.println("Datatype is int");
    }

    void show(boolean b1){
        System.out.println(b1);
        System.out.println("Datatype is boolean");
    }

    void show(String s1){
        System.out.println(s1);
        System.out.println("Datatype is string");
    }

    void show(String s, int a){
        System.out.println("Showing a string and an int");
        System.out.println("String: " + s);
        System.out.println("Integer: " + a);
    }
}


class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.show(5);
        mo.show(true);
        mo.show("Hi there!");
        mo.show("Hello", 5);
    }
}
