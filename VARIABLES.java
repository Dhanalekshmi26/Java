public class VARIABLES {                           // variables are container to store the value or data
    int y = 25;                                   // here y is instances variable which declared inside the class 
    static int z = 26;                  // here z is static variable that use static keyword and it is also declared inside class
    public static void main(String[] args) {
        int x = 23;                             // x is a local variable
        System.out.println(x);
        VARIABLES v = new VARIABLES();
        System.out.println(v.y);
        System.out.println(v.z);
    }
}
