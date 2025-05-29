package _21_Class.BankAccount;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        //예금
        bankAccount.deposit(10000);
        bankAccount.deposit(-4000);

        //출금
        bankAccount.withdraw(1000);
        bankAccount.withdraw(10000);

        //잔액 조회
        System.out.println(bankAccount.getBalance());


    }
}
