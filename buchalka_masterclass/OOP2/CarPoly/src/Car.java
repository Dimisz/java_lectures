public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
        engine = true;
        wheels = 4;
    }

    public String getName(){
        return this.name;
    }

    public int getCylinders(){
        return this.cylinders;
    }

    public String startEngine(){
        return getClass().getName() + " -> startEngine()";
    }

    public String accelerate(){
        return getClass().getName() + " -> accelerate()";
    }

    public String brake(){
        return getClass().getName() + " -> brake()";
    }

}

