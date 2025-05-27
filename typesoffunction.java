public class typesoffunction {
    void greetings(){
        System.out.println("helloo welcome");
    }
    void addition(int a,int b){
        System.out.println("sum:"+ (a+b));
    }
    int display(){
        return 100;
    }
     int multiplication(int c,int d){
        return c*d;
    }
    public static void main(String[] args) {
        typesoffunction typef = new typesoffunction();
        typef.greetings();
        typef.addition(2, 9);
        System.out.println(typef.display());
        int multiplication_result = typef.multiplication(2, 2);
        System.out.println(multiplication_result);
        
        
    }
}
