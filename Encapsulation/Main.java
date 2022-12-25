package Encapsulation;

public class Main {
  public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount("Sara Gurpal", 10000000);

    bankAccount.withdraw(50000);
    bankAccount.deposit(456200);
    bankAccount.withdraw(900000);
    bankAccount.deposit(200000);

    System.out.println(bankAccount.getOwner());
    System.out.println(bankAccount.getBalance());
  }
}
