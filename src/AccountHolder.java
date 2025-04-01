import java.util.ArrayList;

public class AccountHolder {
    private String fullName;
    private String dateOfBirth;
    private String address;
    private ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    public AccountHolder(String fullName, String dateOfBirth, String address) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void createBankAccount(String accountNumber, String accountType){
        AccountHolder holder = new AccountHolder(this.fullName, this.dateOfBirth, this.address);
        BankAccount account = new BankAccount(holder, accountNumber, accountType);
        bankAccounts.add(account);
    }

    public double calculateTotalBalanceOfAllBankAccounts(){
        double balance = 0;
        for(BankAccount account : bankAccounts){
            balance += account.getBalance();
        }
        return balance;
    }
}
