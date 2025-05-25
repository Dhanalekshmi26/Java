public class unary {
    public static void main(String[] args) {
        int a = 30;
        boolean b = false;
        System.out.println("a+:"+ (+a));                  //unary positive
        System.out.println("a+:"+ (-a));                 //unary negative
        a++;                                            //increment
        System.out.println("a++:"+a);                
        a--;                                           //decrement
        System.out.println("a--:"+a);
        System.out.println(!b);                       //NOT
    }
}
