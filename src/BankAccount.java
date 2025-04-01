public class BankAccount {
    private AccountHolder accountHolder;
    private String accountNumber;
    private double balance;
    private String accountType;

    public BankAccount(AccountHolder accountHolder, String accountNumber, String accountType) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 0;
    }

    public void depositCash(double amount) {
        this.balance += amount;
        System.out.println("Cash Deposited successfully. Your current balance is " + this.balance);
    }

    public void withdrawCash(double amount) {
        if (this.balance - amount < 500) {
            System.out.println("Insufficient Funds");
            return;
        }
        this.balance -= amount;
        System.out.println("Cash Withdrawn successfully. Your current balance is " + this.balance);
    }

    public double getBalance() {
        return this.balance;
    }

    public double getBalanceWithInterestAfterPeriods(int years) {
        double interest = 0;
        if(years < 0) {
            System.out.println("Invalid Period");
            return this.balance;
        }
        if (this.accountType.equals("sa")) {
            return this.balance + this.balance * years * 0.02;
        } else if(this.accountType.equals("FA")) {
            if (years < 2) {
                return this.balance + this.balance * years * 0.125;
            } else if (years < 5) {
                return this.balance + this.balance * years * 0.165;
            } else {
                return this.balance + this.balance * years * 0.2;
            }
        }else{
            System.out.println("Invalid Account Type");
            return this.balance;
        }
    }


}
