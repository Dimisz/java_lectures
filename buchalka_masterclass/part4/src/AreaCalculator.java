public class AreaCalculator {
    public static final double PI = Math.PI;
    public static final double INVALID_VALUE = -1.0;

    public static void main(String[] args) {
        System.out.println("78.53975: " + area(5.0));
        System.out.println("-1: " + area(-1));
        System.out.println("20.0: " + area(5.0, 4.0));
        System.out.println("-1: " + area(-1.0,4.0));
    }

    public static double area(double radius){
        if (radius < 0){
            return INVALID_VALUE;
        }
        return radius * radius * PI;
    }

    public static double area(double x, double y){
        if(x < 0 || y < 0){
            return INVALID_VALUE;
        }
        return x * y;
    }
}
