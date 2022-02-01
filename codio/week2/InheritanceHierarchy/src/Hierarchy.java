
class ClassA {}
class ClassB extends ClassA {}
class ClassC {}
class ClassD extends ClassC {}


public class Hierarchy {
    public static void main(String[] args) {

        ClassA a = new ClassA();
        ClassB b = new ClassB();
        ClassC c = new ClassC();
        ClassD d = new ClassD();

        System.out.println(b.getClass());
        System.out.println(b instanceof ClassB);
        System.out.println(b instanceof ClassA);
        System.out.println(a instanceof ClassB);
        System.out.println(d instanceof ClassC);

    }
}
