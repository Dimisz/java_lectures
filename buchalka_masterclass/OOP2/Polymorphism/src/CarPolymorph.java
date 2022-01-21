class Car{
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(String name, int cylinders){
        this.name = name;
        this.cylinders = cylinders;
        wheels = 4;
        engine = true;
    }

    public boolean isEngine(){
        return engine;
    }

    public int getCylinders(){
        return cylinders;
    }

    public int getWheels(){
        return wheels;
    }

    public String getName(){
        return name;
    }

    public void startEngine(){
        System.out.println(name + " started its engine");
    }

    public void accelerate(){
        System.out.println(name + " accelerating");
    }

    public void brake(){
        System.out.println(name + " used brakes");
    }
}

class VW extends Car{
    public VW(){
        super("Volkswagen", 12);
    }
}

class Toyota extends Car {
    public Toyota(){
        super("Toyota", 8);
    }

    @Override
    public void startEngine(){
        System.out.println("Overriden start engine from toyota");
    }

    @Override
    public void accelerate(){
        System.out.println(getName() + " accelerating overriden");
    }

    @Override
    public void brake(){
        System.out.println(getName() + " overriden brake");
    }
}

class Mercedes extends Car{
    public Mercedes(){
        super("Mercedes", 15);
    }
}

public class CarPolymorph {
    public static void main(String[] args) {
        for(int i = 1; i < 4; i++){
            checkCar(makeCar(i));
        }
    }

    public static Car makeCar(int num){
        switch (num){
            case 1:
                return new VW();
            case 2:
                return new Toyota();
            case 3:
                return new Mercedes();
            default:
                return null;
        }
    }

    public static void checkCar(Car car){
        System.out.println("===================");
        System.out.println("Name: " + car.getName());
        System.out.println("Cylinders: " + car.getCylinders());
        System.out.println("Wheels: " + car.getWheels());
        System.out.println("Engine: " + car.isEngine());
        car.startEngine();
        car.accelerate();
        car.brake();
        System.out.println();
    }
}
