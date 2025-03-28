package day31_encapsulation;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;


    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;

    }

    public void displayInfo() {
        System.out.println("Account number  = " + accountNumber);
        System.out.println("Account holder name = " + accountHolderName);
        System.out.println("Balance = " + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
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
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Unavailable balance");
        }
    }

    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Amount of money can not to be negative");
        }
        return balance;
    }

    public double withdraw(double amount) {
        if (amount < balance) {
            balance -= amount;
        } else {
            System.out.println("Balance is lower than withdrawing amount");
        }
        return balance;
    }
}


