package Lesson9;

public class Car {
    String color;
    String engine;
    static int count;

    Car(String color, String engine){
        this.color = color;
        this.engine = engine;
        count++;
    }

    public void showColor(){
        System.out.println("The car's color is: " + color);
    }

    public void changeColor(String color){
        System.out.println("Changing the car's color to: " + color);
        this.color = color;
        System.out.println("Color changed");
    }
}
