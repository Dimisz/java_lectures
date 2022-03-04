package Lesson8;

public class Car {
    String color = "blue";
    String engine = "V6";
}

class Human {
    String name = "John Doe";
    final Car car = new Car();

    public static void main(String[] args) {
        Human h1 = new Human();
//        h1.car = new Car();
//        h1.car = new Car();

        h1.car.engine = "V8";
    }
}
