public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5;   // In binary: 0101
        int b = 3;   // In binary: 0011

        System.out.println("a & b = " + (a & b));  // AND → 0101 & 0011 = 0001 = 1
        System.out.println("a | b = " + (a | b));  // OR  → 0101 | 0011 = 0111 = 7
        System.out.println("a ^ b = " + (a ^ b));  // XOR → 0101 ^ 0011 = 0110 = 6
        System.out.println("~a = " + (~a));        // NOT → ~0101 = 1010 (in 2's comp: -6)

        // Shift Operators
        System.out.println("a << 1 = " + (a << 1));  // Left Shift: 0101 << 1 = 1010 = 10
        System.out.println("a >> 1 = " + (a >> 1));  // Right Shift: 0101 >> 1 = 0010 = 2
    }

}
