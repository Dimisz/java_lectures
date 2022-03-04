package Lesson8;

public class HW2 {
    public static final double PI = 3.1415;

    public double countArea(double radius){
        double area = radius*radius*PI;
        System.out.println("Area of a circle with radius " + radius + " is " + area);
        return area;
    }

    public static double countCircumference(double radius){
        double circumference = 2*PI*radius;
        System.out.println("Circumference of a circle with radius " + radius + " is " + circumference);
        return circumference;
    }

    public void info(double radius){
        countArea(radius);
        countCircumference(radius);
    }
}

class HW2Test {
    public static void main(String[] args) {
        HW2.countCircumference(2);
        HW2 hw2 = new HW2();
        hw2.countArea(2);
        hw2.info(2);
    }
}
