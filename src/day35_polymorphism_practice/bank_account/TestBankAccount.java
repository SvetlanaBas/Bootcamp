package day35_polymorphism_practice.bank_account;

public class TestBankAccount {
    public static void main(String[] args) {

            BankAccount bankAccount = new BankAccount("John Doe", 1000);
            bankAccount.deposit(500);
            bankAccount.withdraw(200);
            bankAccount.withdraw(300, 5);


            CheckingAccount checkingAccount = new CheckingAccount("Jane Smith", 500, 200);
            checkingAccount.withdraw(600);
            checkingAccount.withdraw(750, 10);


            SavingsAccount savingsAccount = new SavingsAccount("Alice Brown", 2000, 5);
            System.out.println("Monthly Interest: $" + savingsAccount.monthlyInterest());
        }
}
