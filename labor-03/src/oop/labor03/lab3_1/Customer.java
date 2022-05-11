package oop.labor03.lab3_1;

public class Customer {
    private String firstName;
    private String lastName;
    private BankAccount account;

    public Customer(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setAccount(BankAccount account){
        this.account = account;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public BankAccount getAccount(){
        return this.account;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void closeAccount(){
        this.account = null;
    }

    @Override
    public String toString(){
        String customer ="COSTUMER\n" + "Name: " + this.firstName + " " + this.lastName + "\n";
        if(account !=null) {
            customer += account.toString() + "\n";
        }
        else {
            customer += "This customer does not have an account\n";
        }
        return customer;
    }
}
