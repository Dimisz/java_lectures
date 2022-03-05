package Lesson11;

public class Car {
    private String color;
    private String engine;
    private int numDoors;

    public Car(String color, String engine, int numDoors){
        this.color = color;
        this.engine = engine;
        this.numDoors = numDoors;
    }

    public void changeNumDoors(int num){
        numDoors = num;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String newColor){
        color = newColor;
    }

    public static void swapColor(Car firstCar, Car secondCar){
        String firstColor = firstCar.getColor();
        firstCar.setColor(secondCar.getColor());
        secondCar.setColor(firstColor);
    }

    public String toString(){
        return "\nColor: " + color + "\tdoors: " + numDoors + "\tengine " + engine;
    }

}

class CaarTest{
    public static void main(String[] args) {
        Car car1 = new Car("Red", "V6", 2);
        Car car2 = new Car("Blue", "V8", 4);
        System.out.println(car1);
        System.out.println(car2);
        car1.changeNumDoors(5);
        car2.changeNumDoors(6);
        Car.swapColor(car1, car2);
        System.out.println(car1);
        System.out.println(car2);
    }
}
