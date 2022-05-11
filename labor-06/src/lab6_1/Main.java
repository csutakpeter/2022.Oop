package lab6_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        /*ArrayList<BankAccount> accounts = new ArrayList<>();
        for(int i=0; i<15; ++i){
            accounts.add(new BankAccount());
        }
        for(BankAccount account : accounts){
            System.out.println(account);
        }
        System.out.println("\n");

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Kis", "Jancsi"));
        customers.add(new Customer("Kozepes", "Janko"));
        customers.add(new Customer("Nagy", "Janos"));

        for(Customer customer : customers){
            for(int i=0; i<2; ++i){
                customer.addAccount();
            }
            System.out.println(customer);
        }*/
        Bank bank = new Bank("OTP");
        bank.addCustomer(new Customer("Kis", "Jancsi"));
        bank.addCustomer(new Customer("Nagy", "Janos"));

        for(int i=1; i<=2; ++i){
            for(int j=0; j<2; ++j){
                bank.getCustomer(i).addAccount();
            }
            //System.out.println(bank.getCustomer(i));
        }
        System.out.println(bank.getCustomer(1));

        bank.getCustomer(1).getAccount("OTP0000001").deposit(500);
        bank.getCustomer(1).getAccount("OTP0000002").deposit(1500);
        bank.getCustomer(2).getAccount("OTP0000003").deposit(1234);
        bank.getCustomer(2).getAccount("OTP0000004").deposit(4321);
        //System.out.println(bank.getCustomer(1));
        System.out.println(bank.getCustomer(2));

        bank.printCustomersToStdout();
        bank.printCustomersToFile("labor-06/src/lab6_1/customers.csv");
        bank.printCustomersToFile("labor-06/src/lab6_1/customers.txt");
    }
}
