package lab8_1.Models;

public class BankAccount {

    protected double balance;
    protected final String accountNumber;
    public static final String PREFIX = "OTP";
    private static int numAccounts = 0;
    public static final int ACCOUNT_NUMBER_LENGTH = 10;

    //constructor
    protected BankAccount() {
        ++numAccounts;
        this.accountNumber = createAccountNumber();
        balance = 0;
    }

    //methods
    public void deposit( double sum ){
        if(sum > 0){
            balance += sum;
        }
    }

    public boolean withdraw( double sum ){
        if( sum <= balance ){
            balance -= sum;
            return true;
        }
        return false;
    }

    private static String createAccountNumber(){
        String accountNumber = PREFIX;
        int digit = numAccounts, pos=0;

        while(digit>0){
            ++pos;
            digit /= 10;
        }
        for(int i=0; i<ACCOUNT_NUMBER_LENGTH-3-pos; ++i){
            accountNumber += "0";
        }
        accountNumber += String.valueOf(numAccounts);

        if(accountNumber.length() < ACCOUNT_NUMBER_LENGTH){
            for(int i=0; i<ACCOUNT_NUMBER_LENGTH - accountNumber.length(); ++i){
                accountNumber += "0";
            }
        }
        return accountNumber;
    }

    //getters
    public double getBalance(){
        return balance;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }

    @Override
    public String toString(){
        String Account = this.accountNumber + " account number, your balance is: " + this.balance + " EUR.";
        return Account;
    }
}
























