package Encapsulation;

public class bankAccount {
    private String accountNumber;
    private double balance;

    public bankAccount(String accountNumber, double balance){
    this.accountNumber= accountNumber;
    this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
     public double getBalance() {
        return balance;
     }
     public boolean withdraw(double amount) {
      if(balance>=amount){
      balance -=amount;
      return true;
      }
      System.out.println("No balance availaible");
      return false;
          }
    }
    
