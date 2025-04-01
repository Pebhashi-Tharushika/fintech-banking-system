public class Main {
    public static void main(String[] args) {
        AccountHolder tomJames = new AccountHolder("Tom James", "03/11/1990", "32/1, New York");

        BankAccount tomJamesSaAccount = new BankAccount(tomJames, "42675", "sa");

        tomJamesSaAccount.depositCash(2000);
        tomJamesSaAccount.withdrawCash(1000);
        tomJamesSaAccount.withdrawCash(1000);
        tomJamesSaAccount.withdrawCash(500);

        System.out.println(tomJamesSaAccount.getBalance());

    }
}