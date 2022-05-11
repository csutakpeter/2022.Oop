package lab3_2;
import oop.labor03.lab3_1.BankAccount;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Csutak","Peter");
        Customer customer2 = new Customer("Csutak","Gergo");

        for(int i=1; i<=5; ++i){
            String account, stri;
            stri = i + "";
            account = "OTP000" + stri;
            customer1.addAccount(new BankAccount(account));
        }
        for(int i=1; i<=9; ++i){
            String account, stri;
            stri = i + "";
            account = "BRD000" + stri;
            customer2.addAccount(new BankAccount(account));
        }

        System.out.println(customer1);
        System.out.println(customer2);

        Random rand = new Random();

        for(int i=1; i<=5; ++i){
            String account, stri;
            stri = i + "";
            account = "OTP000" + stri;
            customer1.getAccount(account).deposit(rand.nextInt(100000));
        }
        for(int i=1; i<=9; ++i){
            String account, stri;
            stri = i + "";
            account = "BRD000" + stri;
            customer2.getAccount(account).deposit(rand.nextInt(100000));
        }

        System.out.println(customer1);
        System.out.println(customer2);

        customer1.closeAccount("OTP0001");
        System.out.println(customer1);

        customer2.closeAccount("BRD0009");
        System.out.println(customer2);
    }
}
