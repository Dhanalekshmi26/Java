public class methodoverloading {
    void show() {
        System.out.println("No args");
    }

    void show(String name) {
        System.out.println("Hello " + name);
    }
    public static void main(String[] args) {
        methodoverloading mol = new methodoverloading();
        mol.show();
        mol.show("meera");
    }
}

