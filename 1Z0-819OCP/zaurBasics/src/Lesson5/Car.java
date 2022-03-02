package Lesson5;

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

public class Car {
    String color;
    String engine;
    int speed;

    Car(String color, String engine){
        this.color = color;
        this.engine = engine;
        speed = 0;
    }

    int accelerate(int kmPerHour){
        speed += kmPerHour;
        return speed;
    }

    int slowDown(int kmPerHour){
        speed -= kmPerHour;
        return speed;
    }

    void showInfo(){
        System.out.println("========= Car Info ==========\n" +
                           "Color: " + color +
                           "\nEngine: " + engine +
                           "\nCurrent speed: " + speed +
                           "\n==============================");
    }

}

class CarTester{
    public static void main(String[] args) {
        Car c1 = new Car("Red", "V8");
//        c1.color = "white";
//        c1.engine = "V6";
//        c1.speed = 60;
        c1.showInfo();
        c1.speed = 100;
        c1.showInfo();

        c1.accelerate(20);
        c1.showInfo();
        c1.slowDown(70);
        c1.showInfo();
    }
}
