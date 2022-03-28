package animal;

public class Dog extends Animal{
    // instance variables
    private String breed;

    // constructor
    public Dog(int age, String breed){
        super(age);
        this.breed = breed;
    }

    // getters and setters

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // other methods
    @Override
    public void speak(){
        System.out.println(name + " says: Fear my bark!");
    }

    @Override
    public String toString(){
        return "Dog named: " + name + " of breed: " + breed;
    }

    public boolean equals(Object otherObject){
        Dog otherDog = (Dog) otherObject;
        return (name.equals(otherDog.name) && breed.equals(otherDog.getBreed()));
    }
}
