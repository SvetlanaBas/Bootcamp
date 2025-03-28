package day31_encapsulation;

public class TestBankAccount {
        public static void main(String[] args) {
            BankAccount account = new BankAccount("12545554","Alice");
            System.out.println("Account balance after deposit -> " + account.deposit(500));
            System.out.println("Account balance after withdraw -> " + account.withdraw(45));
        }
    }

