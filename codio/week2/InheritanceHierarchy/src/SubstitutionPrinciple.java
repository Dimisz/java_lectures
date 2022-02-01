//The substitution works when a subclass is used in place of its superclass.

class ClassOne {
    public void greeting() {
        System.out.println("Hello from Class One");
    }
}

class ClassTwo extends ClassOne {
    public void greeting() {
        System.out.println("Hello from Class Two");
    }
}

class ClassThree extends ClassTwo {
    public void greeting() {
        System.out.println("Hello from Class Three");
    }
}

//add class definitions above this line


public class SubstitutionPrinciple {

    public static void substitution(ClassOne one) {
        one.greeting();
    }

    public static void main(String[] args) {
        ClassTwo two = new ClassTwo();
        substitution(two); // works since Two inherits from One

        ClassThree three = new ClassThree();
        substitution(three); // Three -> Two -> One
    }
}
