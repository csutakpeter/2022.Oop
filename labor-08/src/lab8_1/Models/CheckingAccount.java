package lab8_1.Models;

public class CheckingAccount extends BankAccount{
    private double overdraftLimit;

    public CheckingAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw( double amount ){
        if( amount <= this.balance + overdraftLimit ){
            this.balance -= amount;
            return true;
        }
        else System.out.println("Non-sufficient funds");
        return false;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "overdraftLimit=" + overdraftLimit +
                '}';
    }
}