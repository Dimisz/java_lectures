package animal;

/**
 * represents a generic animal
 * Dog, Cat and other subclasses would be created
 */
public class Animal {
    static int DEFAULT_AGE = 0;

    // instance variables
    int age;
    double weight;
    String name;

    public Animal(int age){
        this.age = age;
    }

    public Animal(){
        this(DEFAULT_AGE);
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // other methods
    public void speak(){
        System.out.println("Animal says hi.");
    }

    @Override
    public String toString() {
        return this.name;
    }
}
