public class StarPattern {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {          // Controls the number of rows
            for (int j = 1; j <= i; j++) {      // Prints * i times in each row
                System.out.print("*");
            }
            System.out.println();               // Moves to the next line
        }
    }
}
