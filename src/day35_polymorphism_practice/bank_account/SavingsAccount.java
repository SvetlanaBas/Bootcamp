package day35_polymorphism_practice.bank_account;

public class SavingsAccount extends BankAccount {
        private double interestRate;

        public SavingsAccount(String accountHolderName, double balance, double interestRate) {
            super(accountHolderName, balance);
            this.interestRate = interestRate;
        }

        public double monthlyInterest() {
            return (super.getBalance() * (interestRate / 100)) / 12;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }
    }

