package Encapsulation;

public class maine1 {
    public static void main (String args[]){
        bankAccount BankAccount = new bankAccount("123",100.0);
        System.out.println("Balance: "+ BankAccount.getBalance());
        BankAccount.withdraw(10);
        System.out.println("Balance: " + BankAccount.getBalance());
    }
}
