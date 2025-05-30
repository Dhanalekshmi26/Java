/*Create a class AreaCalculator with overloaded calculateArea() methods for:

Circle (double radius)

Rectangle (double length, double width)

Square (int side)
Call all using a single object. */


public class AreaCalculator {

    void calculateArea(double radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    void calculateArea(double length, double width) {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }

    void calculateArea(int side) {
        int area = side * side;
        System.out.println("Area of Square: " + area);
    }

    public static void main(String[] args) {
        AreaCalculator ac = new AreaCalculator();
        ac.calculateArea(2.5);               // Circle
        ac.calculateArea(3.4, 7.7);   // Rectangle
        ac.calculateArea(10);                // Square
    }
}
