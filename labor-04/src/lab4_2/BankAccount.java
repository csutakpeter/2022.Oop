package lab4_2;

public class BankAccount {

    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
        balance = 0;
    }

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