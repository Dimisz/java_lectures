package animal;

public class Cat extends Animal{
    // static variables

    static String DEFAULT_TYPE = "Domestic";

    // instance variables
    private String type;

    // also inherits variables from the Animal superclass
    public Cat(int age){
        super(age);
        this.type = Cat.DEFAULT_TYPE;
    }

    // getters and setters

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // other methods
    @Override
    public void speak(){
        System.out.println(name + " says: Meow!");
    }

    public String toString(){
        return name + " is a " + type;
    }
}
