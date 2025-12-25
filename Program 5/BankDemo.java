// Base class
abstract class BankAccount {
    protected String customerName;
    protected int accountNumber;
    protected double balance;

    BankAccount(String name, int accNo, double bal) {
        customerName = name;
        accountNumber = accNo;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    abstract void withdraw(double amount);

    void display() {
        System.out.println("Name: " + customerName);
        System.out.println("Account No: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// Savings Account
class SavingsAccount extends BankAccount {
    private double interestRate; // annual rate

    SavingsAccount(String name, int accNo, double bal, double rate) {
        super(name, accNo, bal);
        interestRate = rate;
    }

    void addInterest(int years) {
        balance = balance * Math.pow((1 + interestRate / 100), years);
        System.out.println("Compound interest added.");
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

// Current Account
class CurrentAccount extends BankAccount {
    private double minimumBalance = 5000;
    private double serviceCharge = 200;

    CurrentAccount(String name, int accNo, double bal) {
        super(name, accNo, bal);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            if (balance < minimumBalance) {
                balance -= serviceCharge;
                System.out.println("Minimum balance not maintained.");
                System.out.println("Service charge imposed: " + serviceCharge);
            }
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

// Main class
public class BankDemo {
    public static void main(String[] args) {

        System.out.println("----- Savings Account -----");
        SavingsAccount sa = new SavingsAccount("Raj", 101, 20000, 5);
        sa.deposit(5000);
        sa.addInterest(2);
        sa.withdraw(3000);
        sa.display();

        System.out.println("\n----- Current Account -----");
        CurrentAccount ca = new CurrentAccount("Amit", 102, 10000);
        ca.deposit(2000);
        ca.withdraw(8000);
        ca.display();
    }
}
