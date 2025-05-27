public class finalexample {
    public static void main(String[] args) {
        int x = 2;
        x = 5;
        System.out.println(x);

        final int y = 5;
        //y = 10;            
        System.out.println(y);
    }  //if u give this statement to your code wont work because final value or constant value of y is 5
}
