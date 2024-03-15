package bank;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = Math.max(balance,0);

    }

    public double myDeposit(double amount){
        if (amount > 0){
            this.balance = this.balance + amount;
            return amount;
        } else{
            return 0;
        }


    }

    public double myWithdrawal(double amount){
        if (amount <= this.balance){
            this.balance = this.balance - amount;
            return amount;
        } else {
            return 0;
        }

    }

    public String getOwner() {return owner;}

    public double getBalance() {return balance;}
}
