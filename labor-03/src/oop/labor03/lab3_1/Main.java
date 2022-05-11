package oop.labor03.lab3_1;

public class Main {
    public static void main(String[] args){
        Customer customer1 = new Customer("John","BLACK");
        //System.out.println(customer1.toString());
        System.out.println(customer1);

        customer1.setAccount(new BankAccount("OTP00001"));
        System.out.println(customer1);

        customer1.getAccount().deposit(1000);
        System.out.println(customer1);

        //Perform other operations with the customer account.
        /*
        boolean result = customer1.getAccount().withdraw(1001);
        if ( !result ){
            System.out.println("You do not have sufficient funds for this operation!\n");
        }

        customer1.closeAccount();
        System.out.println(customer1);

        customer1.setAccount(new BankAccount("OTP00001"));
        customer1.setLastName("Jr.");
        System.out.println(customer1);
        */

        Customer customer2 = new Customer("Mary", "WHITE");
        customer2.setAccount(new BankAccount("OTP00002"));
        System.out.println(customer2);

        //Perform some operations with Mary’s account
        /*
        customer2.getAccount().deposit(2000);
        System.out.println(customer2);

        boolean result = customer2.getAccount().withdraw(1001);
        if ( !result ){
            System.out.println("You do not have sufficient funds for this operation!\n");
        }
        System.out.println(customer2);

        System.out.println(customer2.getAccount().getAccountNumber() +" "+ customer2.getAccount().getBalance());
        */

        customer2.closeAccount();
        System.out.println(customer2);

        customer2.setLastName(customer1.getLastName());
        customer2.setAccount(customer1.getAccount());
        System.out.println(customer2);
    }
}
