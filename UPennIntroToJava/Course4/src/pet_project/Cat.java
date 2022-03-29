package pet_project;

public class Cat extends Pet{

    // static variable
    private static String SOUND = "Meow"; // default sound for all cats

    // instance variables
    private String type;


    // constructor
    public Cat(int age, String name, double weight, String type){
        super(age, name, weight);
        this.type = type;
    }

    // getters and setters


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // implement abstract methods
    @Override
    public void makeSound(){
        System.out.println(Cat.SOUND);
    }

    @Override
    public String toString(){
        return this.name + " is a " + this.type;
    }
}
