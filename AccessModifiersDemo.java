// Class with different access modifiers
public class AccessModifiersDemo {

    public int publicVar = 10;
    private int privateVar = 20;
    protected int protectedVar = 30;

    public void publicMethod() {
        System.out.println("This is a PUBLIC method");
    }

    private void privateMethod() {
        System.out.println("This is a PRIVATE method");
    }

    protected void protectedMethod() {
        System.out.println("This is a PROTECTED method");
    }

    // Method to access private members within the same class
    public void accessPrivate() {
        System.out.println("Accessing privateVar: " + privateVar);
        privateMethod();
    }
}

// Another class to test access
class TestAccess {
    public static void main(String[] args) {
        AccessModifiersDemo obj = new AccessModifiersDemo();

        // ✅ Public access: allowed
        System.out.println("Public var: " + obj.publicVar);
        obj.publicMethod();

        // ❌ Private access: not allowed directly
        // System.out.println("Private var: " + obj.privateVar); // Error
        // obj.privateMethod(); // Error

        // ✅ Can access private using public method in same class
        obj.accessPrivate();

        // ✅ Protected access: allowed in same package
        System.out.println("Protected var: " + obj.protectedVar);
        obj.protectedMethod();
    }
}
