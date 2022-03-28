package animal;

import java.util.ArrayList;

public class AnimalManager {

    //instance variable
    ArrayList<Animal> animals;


    //constructor
    public AnimalManager(){
        animals = new ArrayList<Animal>();
    }

    // methods
    public void printAnimals(){
        for(Animal animal : animals){
            System.out.println(animal);
        }
    }

    public void makeAnimalsSpeak(){
        for(Animal animal : animals){
            animal.speak();
        }
    }


    public static void main(String[] args) {
        // create a generic animal
        Animal animal = new Animal(2);
        animal.setName("Bob the animal");
        System.out.println(animal);


        // create some dogs
        Dog dog1 = new Dog(4, "Pug");
        dog1.setName("Puggles");

        Dog dog2 = new Dog(9, "Pug");
        dog2.setName("Puggles");

        // create a cat
        Cat cat1 = new Cat(8);
        cat1.setName("Teddy");
        cat1.setType("outside");
        System.out.println(cat1);

        // create an instance of AnimalManager
        AnimalManager animalManager = new AnimalManager();
        animalManager.animals.add(animal);
        animalManager.animals.add(dog1);
        animalManager.animals.add(dog2);
        animalManager.animals.add(cat1);

        System.out.println();
        animalManager.printAnimals();
        System.out.println();
        animalManager.makeAnimalsSpeak();


        // compare dog1 to dog2
        System.out.println("\nComparing animals...");
        System.out.println("dog1 equals dog2: " + dog1.equals(dog2));
        dog2.setBreed("Golden Retriever");
        System.out.println("After changing the breed, dog1 equals dog2: " + dog1.equals(dog2));






    }
}
