

public class CONSTRUCTOR {
    String car_name;
    int car_price;
    CONSTRUCTOR(String n , int p){
        car_name = n;
        car_price = p;
    }
    
       void displayDetails(){
        System.out.printf("Car Name: %s\nCar Price: %d\n", car_name, car_price);
    }



    
    public static void main(String[] args) {
        CONSTRUCTOR c = new CONSTRUCTOR("Duster", 400000);
        c.displayDetails();
    }
}
