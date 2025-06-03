abstract class Vehicle{
    abstract void speed();
    abstract void brake();
    abstract void caresponse();
    abstract void carreaction();
    abstract void carspeaking();

    void action(){
        System.out.println("person to car -> Hey car starts the engine ");
    }}
    
    class Car extends Vehicle{
        @Override
        void carspeaking(){
            System.out.println("car to person -> Hey i started now u can drive me!");

        }
        @Override
        void speed(){
            System.out.println("person to car -> hey car u r moving in high speed");
        }
        @Override
        void carreaction(){
            System.out.println("car to person -> oh noo it's very high speed");
        }
        @Override
        void brake(){
            System.out.println("person to car -> now brake is need put the brake");

        }
        @Override
        void caresponse(){
            System.out.println("car to person -> yes u r right i applied brake,now u r safe");

        }

    }


public class Abstraction {
    public static void main(String[] args){
        Vehicle vc = new Car();
        vc.action();
        vc.carspeaking();
        vc.speed();
        vc.carreaction();
        vc.brake();
        vc.caresponse();

    }
}
