public class Main {
    public static void main(String[] args) {

        AccountHolder thomas = new AccountHolder("Thomas James", "03/11/1990", "32/1, New York");

        BankAccount thomasAcc1 = new BankAccount(thomas, "42675", "sa");


        thomasAcc1.depositCash(2500);
        thomasAcc1.withdrawCash();
        thomasAcc1.withdrawCash();
        thomasAcc1.depositCash(5000);
        thomasAcc1.withdrawCash();
        thomasAcc1.depositCash(1000);

        thomasAcc1.getWithdrawalsHistory();
        thomasAcc1.getWithdrawalsHistoryFromRecentToPast();
        thomasAcc1.getDepositsHistory();

    }
}