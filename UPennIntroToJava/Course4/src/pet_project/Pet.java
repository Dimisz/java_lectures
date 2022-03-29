package pet_project;

public abstract class Pet {
    // instance variables with default (package-private) access
    int age;
    String name;
    double weight;

    // constructor
    public Pet(int age, String name, double weight){
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    // non-abstract methods
    // getters and setters


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void eat(Food food){
        this.weight += (food.getCalories()/100);
    }

    // abstract methods
    public abstract void makeSound();

    public abstract String toString();
}
