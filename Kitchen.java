class Cooking extends Thread {
    public void run() {
        System.out.println("Boiling water...");
    }
}

class Cleaning extends Thread {
    public void run() {
        System.out.println("Washing dishes...");
    }
}

public class Kitchen {
    public static void main(String[] args) {
        Cooking c = new Cooking();
        Cleaning d = new Cleaning();

        c.start();
        d.start();
    }
}
