public class constructorexample {
    String name;
    constructorexample(String n){
        name = n;
    }
    void show() {
        System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
        constructorexample c = new constructorexample("meera");
        c.show();
        
    }
}
