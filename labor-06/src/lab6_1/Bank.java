package lab6_1;

import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private final String name;
    private ArrayList<Customer> customers;
    private int numCustomers=0;

    //constructor
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    //methods
    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public int numCustomers(){
        this.numCustomers++;
        return numCustomers;
    }

    //getters
    public Customer getCustomer(int id){
        for(Customer customer : this.customers){
            if(customer.getId().equals(String.valueOf(id))) {
                return customer;
            }
        }
        return null;
    }

    //print
    private void printCustomers( PrintStream ps ){
        ps.println("ID, Firstname, Last name, Number of bank accounts");
        for( Customer customer: customers ){
            ps.println( customer.getId()+", " + customer.getFirstName() +", "+
                    customer.getLastName()+", "+customer.getNumAccounts());
        }
        ps.close();
    }

    public void printCustomersToStdout(){
        printCustomers( System.out );
    }

    public void printCustomersToFile( String filename ){
        try {
            printCustomers( new PrintStream(filename ));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
