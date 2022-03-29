package pet_project;

public class Dog extends Pet{
    // static variable
    private static String SOUND = "Bark!";

    // instance variable
    private String breed;

    // constructor
    public Dog(int age, String name, double weight, String breed){
        super(age, name, weight);
        this.breed = breed;
    }


    // getters and setters


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // implement abstract methods
    @Override
    public void makeSound(){
        System.out.println(Dog.SOUND);
    }

    @Override
    public String toString(){
        return this.name + " is a " + this.breed;
    }
}
