package Lesson5;

public class Car {
    String color;
    String engine;
    int speed;

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
        Car c1 = new Car();
        c1.color = "white";
        c1.engine = "V6";
        c1.speed = 60;
        c1.showInfo();

        c1.accelerate(20);
        c1.showInfo();
        c1.slowDown(70);
        c1.showInfo();
    }
}
