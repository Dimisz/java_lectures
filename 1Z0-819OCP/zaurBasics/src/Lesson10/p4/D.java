package Lesson10.p4;

import Lesson10.p1.A;
import static Lesson10.p1.p2.B.*;
import Lesson10.p1.p2.p3.C;
import Lesson10.p4.p5.E;

public class D {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.classA);

        System.out.println(p2a);
        System.out.println(p2b);

        C c = new C();
        System.out.println(c.p3c);

        E ec = new E();
        System.out.println(ec.e);


    }
}
