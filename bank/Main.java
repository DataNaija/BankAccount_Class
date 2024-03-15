package bank;

public class Main {
    public static void main(String[] args) {
        BankAccount customerA = new BankAccount("Muhydeen Adelani", 200000);

        customerA.myDeposit(50000);
        customerA.myWithdrawal(1000);
        customerA.myWithdrawal(3000);

        System.out.println(customerA.getOwner());
        System.out.println(customerA.getBalance());
    }
}
