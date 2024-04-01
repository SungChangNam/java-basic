package oop1.ex;

public class AccomuntMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.dposit(10000);
        account.withdraw(9000);
        account.withdraw(2000); // 오류 메세지 출력
        System.out.println("현재 작액은 :" + account.balance);
    }
}
