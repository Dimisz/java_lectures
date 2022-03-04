package Lesson9;

public class HW1 {
    static int count = 0;

    public HW1(){
        count++;
        System.out.println("Object " + count + " created");
    }
    
}

class HW1Test {
    public static void main(String[] args) {
        HW1 obj1 = new HW1();
        HW1 obj2 = new HW1();
        HW1 obj3 = new HW1();
        HW1 obj4 = new HW1();
        HW1 obj5 = new HW1();
        HW1 obj6 = new HW1();
        HW1 obj7 = new HW1();
        HW1 obj8 = new HW1();

        obj1 = null;
        obj2 = null;
        obj3 = null;
        obj4 = null;
        obj5 = null;
        obj6 = null;

    }
}
