package OOPs;
// Write a Java program to create a class called "BankAccount" with attributes for
// account number, account holder's name, and balance. Include methods for depositing
// and withdrawing money, as well as checking the balance. Create a subclass
// called "SavingsAccount" that adds an interest rate attribute and a method to apply interest.

 class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public double checkBalance() {
        return balance;
    }


    public String getAccountDetails() {
        return "Account Number: " + accountNumber + "\nAccount Holder: " + accountHolderName + "\nBalance: " + balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = checkBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest applied: " + interest);
    }
}
public class Oops20 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("123456789", "John Doe", 1000.0, 5.0);
        System.out.println(savingsAccount.getAccountDetails());

        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        savingsAccount.applyInterest();

        System.out.println("Final Balance: " + savingsAccount.checkBalance());
    }

}
