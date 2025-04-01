public class Main {
    public static void main(String[] args) {

        AccountHolder thomas = new AccountHolder("Thomas James", "03/11/1990", "32/1, New York");

        BankAccount thomasAcc1 = new BankAccount(thomas, "42675", "sa");
        BankAccount thomasAcc2 = new BankAccount(thomas, "42675", "FA");
        BankAccount thomasAcc3 = new BankAccount(thomas, "42675", "ba");

        thomasAcc1.depositCash(2500);
        thomasAcc1.withdrawCash();


    }
}