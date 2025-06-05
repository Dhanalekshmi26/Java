class Bank {
    int balance = 1000;

    // synchronized method to allow one thread at a time
    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is trying to withdraw " + amount);
            try {
                Thread.sleep(1000); // simulate processing time
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " - Not enough balance to withdraw " + amount);
        }
    }
}

class Customer extends Thread {
    Bank bank;
    int amount;

    Customer(Bank b, int amt, String name) {
        super(name);  // set thread name
        bank = b;
        amount = amt;
    }
@Override
    public void run() {
        bank.withdraw(amount);
    }
}

public class Mainn {
    public static void main(String[] args) {
        Bank account = new Bank();

        Customer c1 = new Customer(account, 700, "Customer A");
        Customer c2 = new Customer(account, 500, "Customer B");

        c1.start();
        c2.start();
    }
}
