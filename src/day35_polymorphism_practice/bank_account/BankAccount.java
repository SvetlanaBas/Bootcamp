package day35_polymorphism_practice.bank_account;

public class BankAccount {
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("your balance = " + balance + " and you're trying to withdraw ->  " + amount);
        }
    }

    public void withdraw(double amount, double transactionFee) {
        double total = amount + transactionFee;
        if (total <= balance) {
            balance -= total;
        } else {
            System.out.println("your balance = " + balance + " and you're trying to withdraw ->  " + total);
        }
    }


    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
