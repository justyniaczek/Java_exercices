public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account(2);
        Account account3 = new Account(3, 250);


        System.out.println(account1.getAccountNumber());
        account1.setAccountNumber(22);
        System.out.println(account1.getAccountNumber());
        account1.setBalance(120);
        System.out.println(account1.getBalance());

        System.out.println(' ');
        System.out.println(account2.getAccountNumber());
        System.out.println(account2.getBalance());
        account2.credit(300);
        System.out.println(account2.getBalance());

        System.out.println(' ');
        System.out.println(account3.getAccountNumber());
        System.out.println(account3.getBalance());
        account3.credit(20);
        System.out.println(account3.getBalance());


    }
}
