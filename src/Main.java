public class Main {
    public static void main(String[] args) {

        AccountHolder thomas = new AccountHolder("Thomas James", "03/11/1990", "32/1, New York");

        BankAccount thomasAcc1 = new BankAccount(thomas, "42675", "sa");
        BankAccount thomasAcc2 = new BankAccount(thomas, "42675", "FA");
        BankAccount thomasAcc3 = new BankAccount(thomas, "42675", "ba");

        thomasAcc1.depositCash(2500);
        thomasAcc1.withdrawCash(1000);
        thomasAcc1.withdrawCash(1000);
        thomasAcc1.withdrawCash(500);
        thomasAcc1.depositCash(500);

        System.out.println(thomasAcc1.getBalance());

        System.out.println(thomasAcc1.getBalanceWithInterestAfterPeriods(-1));
        System.out.println(thomasAcc1.getBalanceWithInterestAfterPeriods(5));

        thomasAcc2.depositCash(1000);
        System.out.println(thomasAcc2.getBalanceWithInterestAfterPeriods(-2));
        System.out.println(thomasAcc2.getBalanceWithInterestAfterPeriods(1));
        System.out.println(thomasAcc2.getBalanceWithInterestAfterPeriods(2));
        System.out.println(thomasAcc2.getBalanceWithInterestAfterPeriods(3));
        System.out.println(thomasAcc2.getBalanceWithInterestAfterPeriods(5));
        System.out.println(thomasAcc2.getBalanceWithInterestAfterPeriods(10));

        thomasAcc3.depositCash(1000);
        System.out.println(thomasAcc3.getBalanceWithInterestAfterPeriods(5));

    }
}