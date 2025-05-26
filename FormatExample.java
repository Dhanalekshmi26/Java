public class FormatExample {
    public static void main(String[] args) {
        String name = "Iva";
        int age = 22;
        double score = 85.5;

        System.out.printf("Name: %s\n", name);               // %s for string
        System.out.printf("Age: %d years\n", age);          // %d for integer
        System.out.printf("Score: %.2f marks\n", score);   // %.2f for 2 decimal float
    }
}
