/*Create a base class Vehicle with a method start() that prints "Vehicle is starting".
Create a derived class Car that extends Vehicle and adds a method drive() that prints "Car is driving".
In the main method, create a Car object and call both methods. */

class Vehicle {
    void start(){
        System.out.println("Vehicle is starting");
    }}
    class car extends Vehicle{
        void drive(){
            System.out.println("Car is driving");
        }
    }
public class IH{
    public static void main(String[] args) {
        car c = new car();
        c.drive();
        c.start();

        
    }
}
