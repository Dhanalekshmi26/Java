
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class checkingthread{
    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // Create a new thread object
        t1.start();                   // Start the thread, runs run() in a new thread
    }
}
