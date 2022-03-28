package animal;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @org.junit.jupiter.api.Test
    void testEquals() {
        // assumes we've implemented the equals method in the Dog class
        Dog dog1 = new Dog(4, "Pug");
        dog1.setName("Tommy");

        Dog dog2 = new Dog(8, "Pug");
        dog2.setName("Tommy");

        // should be equal
        assertEquals(dog1, dog2);
    }
}