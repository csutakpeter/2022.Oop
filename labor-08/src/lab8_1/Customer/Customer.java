package lab8_1.Customer;

import lab8_1.Models.BankAccount;
import lab8_1.Models.SavingsAccount;

import java.util.ArrayList;

public class Customer {
    private final String firstName;
    private String lastName;
    private static int numCustomers = 0;
    private final String id;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    //constructor
    public Customer(String firstName, String lastName){
        ++numCustomers;
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = String.valueOf(numCustomers);
    }

    //methods
    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void closeAccount(String accountNumber){
        for(BankAccount account : accounts){
            if(account.getAccountNumber().equals(accountNumber)){
                accounts.remove(account);
            }
        }
    }

    //getters
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getId() { return id; }
    public int getNumAccounts(){
        int num=0;
        for(BankAccount account : accounts){
            ++num;
        }
        return num;
    }

    public BankAccount getAccount(String accountNumber){
        for(BankAccount account : accounts){
            if(account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        return null;
    }

    public String getAccountNumbers(){
        for(BankAccount account : accounts){
            return account.getAccountNumber();
        }
        return null;
    }

    //setters
    public void setLastName(String lastName){
        this.lastName = lastName;
    }


    @Override
    public String toString(){
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + "\n" + "ID: " + id + "\n" + " accounts:\n");
        int i=0;
        for(BankAccount account : accounts){
            result.append("\t" + "Account number: " + account.getAccountNumber() + "\n");
            result.append("\t" + "Balance: " + account.getBalance() + "\n");
            //if(i%2 == 0) result.append("\t" + "Balance: " + account.getBalance() + "\n");
            ++i;

            result.append("\t" + account.toString() + "\n\n");
        }
        // result.append(accounts.toString());
        return result.toString();
    }
}