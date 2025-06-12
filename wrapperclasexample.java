public class wrapperclasexample {
    public static void main(String[] args){
        // byte -> Byte
        byte b = 10;
        Byte byteObj = b;           // Autoboxing: primitive → wrapper
        byte b2 = byteObj;          // Unboxing: wrapper → primitive
        System.out.println("Byte: " + byteObj + ", Parsed: " + Byte.parseByte("10"));

        // short -> Short
        short s = 1000;
        Short shortObj = s;
        short s2 = shortObj;
        System.out.println("Short: " + shortObj + ", Max: " + Short.MAX_VALUE);

        // int -> Integer
        int i = 5000;
        Integer intObj = i;
        int i2 = intObj;
        System.out.println("Integer: " + intObj + ", Binary: " + Integer.toBinaryString(5));

        // long -> Long
        long l = 100000L;
        Long longObj = l;
        long l2 = longObj;
        System.out.println("Long: " + longObj + ", Hex: " + Long.toHexString(255));

        // float -> Float
        float f = 12.34f;
        Float floatObj = f;
        float f2 = floatObj;
        System.out.println("Float: " + floatObj + ", Is NaN: " + floatObj.isNaN());

        // double -> Double
        double d = 45.67;
        Double doubleObj = d;
        double d2 = doubleObj;
        System.out.println("Double: " + doubleObj + ", Compare: " + Double.compare(5.0, 3.0));

        // char -> Character
        char c = 'A';
        Character charObj = c;
        char c2 = charObj;
        System.out.println("Character: " + charObj + ", Is Letter: " + Character.isLetter(c));

        // boolean -> Boolean
        boolean bool = true;
        Boolean boolObj = bool;
        boolean bool2 = boolObj;
        System.out.println("Boolean: " + boolObj + ", Negation: " + !boolObj);
    }
}
