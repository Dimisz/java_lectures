package pet_project;

import java.util.ArrayList;

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


    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<Pet>();
        Dog dog = new Dog(14, "Buster", 100, "German Shepard");
        Cat cat = new Cat(3, "Snuggles", 40, "House Cat");

        pets.add(dog);
        pets.add(cat);

        for(Pet pet : pets){
            pet.makeSound();
            System.out.println(pet);
            System.out.println();
        }

        System.out.println(dog.getBreed() + "'s current weight is: " + dog.getWeight());
        Food food = new Food(1000);
        dog.eat(food);
        System.out.println(dog.getBreed() + "'s current weight is: " + dog.getWeight());

    }
}
