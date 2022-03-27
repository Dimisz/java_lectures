package dog;

public class Dog {
    // static variables
    static String DEFAULT_NAME = "Generic dog";
    static double DEFAULT_AGE = 0.5;
    static double DEFAULT_WEIGHT = 1.75;
    static String DEFAULT_FOOD = "Generic dog food";
    static String DEFAULT_BARK = "Bark!";
    static int DEFAULT_NUM_TIMES_TO_BARK = 1;
    static final double WEIGHT_GAIN_INCREASE = 0.01;


    // instance vaariables
    String name;
    double age;
    double weight;
    String owner;


    public Dog(String name, double age, double weight, String owner){
        this.name = name;
        this.age = age;
        this.owner = owner;
        this.weight = weight;
    }


    public Dog(String name, double age){
        this(name, age, DEFAULT_WEIGHT, null);
    }


    public Dog(){
        this(DEFAULT_NAME, DEFAULT_AGE);
    }


    public double eat(double amount, String food){
        System.out.println(name + " is eating " + amount + " of " + food);
        double weightGain = amount * Dog.WEIGHT_GAIN_INCREASE;
        weight += weightGain;
        return weight;
    }

    public double eat(double amount){
        return eat(amount, Dog.DEFAULT_FOOD);
    }

    public double eat(String amount){
        double returnVal = 0.0;
        try {
            double amountAsDouble = Double.parseDouble(amount);
            return eat(amountAsDouble, DEFAULT_FOOD);
        }
        catch(NumberFormatException e){
            System.out.println(amount + " can't be parsed as double");
            return returnVal;
        }
    }

    public void bark(int numTimes, String barkSound){
        System.out.println(name + " says:");
        for(int i = 0; i < numTimes; i++){
            System.out.println(barkSound);
        }
        System.out.println();
    }

    public void bark(String barkSound, int numTimes){
        bark(numTimes, barkSound);
    }

    public void bark(){
        bark(DEFAULT_NUM_TIMES_TO_BARK, DEFAULT_BARK);
    }

    public double getWeight(){
        return weight;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public String toString(){
        return "Name: " + name + ", weight: " + weight +
                     ", age: " + age + ", owner: " + owner;
    }


    public static void main(String[] args) {
        Dog dog1 = new Dog("Princess", 12.7, 9.3, "Brandon");
        Dog dog2 = new Dog("Fido", 5.5); //second constructor
        Dog dog3 = new Dog(); // third no-arg constructor

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog3.setName("Samantha");
        System.out.println(dog3);

        //call first eat method
        dog1.eat(2.1, "beneful");
        System.out.println(dog1);

        //call second eat method
        dog2.eat(1.1);
        System.out.println(dog2);

        dog3.eat(1);
        System.out.println(dog3);

        //call third eat method
        dog3.eat("12.3");
        System.out.println(dog3);

        dog3.eat("twelve pounds");
        System.out.println(dog3);


        // call the first bark method
        dog1.bark(2, "Woof!");

        // call the second bark method
        dog1.bark("Help me!", 1);

        // call no-arg bark method
        dog1.bark();
    }

}
