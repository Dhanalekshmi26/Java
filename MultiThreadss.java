class MyJob extends Thread {
    @Override
    public void run() {
        System.out.println("Thread running: " + getName());
    }
}

public class MultiThreadss {
    public static void main(String[] args) {
        MyJob t1 = new MyJob();
        MyJob t2 = new MyJob();
        MyJob t3 = new MyJob();

        t1.start();
        t2.start();
        t3.start();
    }
}
