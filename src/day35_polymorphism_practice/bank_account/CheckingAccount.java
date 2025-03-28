package day35_polymorphism_practice.bank_account;

public class CheckingAccount extends BankAccount {

        private double overdraftLimit;

        public CheckingAccount(String accountHolderName, double balance, double overdraftLimit) {
            super(accountHolderName, balance);
            this.overdraftLimit = overdraftLimit;
        }


        // Allow withdrawal if balance ≥ amount and within overdraft limit.
        @Override
        public void withdraw(double amount) {
            if (super.getBalance() >= amount && amount <= overdraftLimit) {
                double balance = super.getBalance() - amount;
                super.setBalance(balance);
            } else {
                System.out.println("your balance = " + super.getBalance() + " and you're trying to withdraw ->  " + amount);
            }
        }

        public double getOverdraftLimit() {
            return overdraftLimit;
        }

        public void setOverdraftLimit(double overdraftLimit) {
            this.overdraftLimit = overdraftLimit;
        }
    }
