package lab8_1.Utils;

import lab8_1.Bank.Bank;
import lab8_1.Customer.Customer;
import lab8_1.Models.BankAccount;
import lab8_1.Models.SavingsAccount;
import lab8_1.Models.CheckingAccount;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //saving and checking account test
        /*BankAccount checkingAccount = new CheckingAccount(1000);
        BankAccount savingsAccount = new SavingsAccount(2);
        checkingAccount.deposit(1000);
        checkingAccount.withdraw(2001);
        System.out.println(checkingAccount);
        savingsAccount.deposit(5);
        savingsAccount.deposit(1000);
        ((SavingsAccount) savingsAccount).setInterestRate(3);
        ((SavingsAccount) savingsAccount).addInterest();
        System.out.println(savingsAccount);
        System.out.println(savingsAccount.getBalance());*/

        Bank bank = new Bank("OTP");
        bank.addCustomer(new Customer("Kis", "Jancsi"));
        bank.addCustomer(new Customer("Nagy", "Janos"));
        for (int i = 1; i <= 2; ++i) {
            bank.getCustomer(i).addAccount(new SavingsAccount(0.2));
            bank.getCustomer(i).addAccount(new CheckingAccount(1000));
        }

        bank.getCustomer(1).getAccount("OTP0000001").deposit(500);
        bank.getCustomer(2).getAccount("OTP0000003").deposit(1234);
        for (int i = 1; i <= 2; ++i) {
            System.out.println(bank.getCustomer(i));
        }

        ((SavingsAccount) bank.getCustomer(1).getAccount("OTP0000001")).addInterest();
        ((SavingsAccount) bank.getCustomer(2).getAccount("OTP0000003")).addInterest();
        for (int i = 1; i <= 2; ++i) {
            System.out.println(bank.getCustomer(i));
        }

        /*Random rand = new Random();
        ((CheckingAccount) bank.getCustomer(1).getAccount("OTP0000002")).withdraw(rand.nextInt(1, 2000));
        for(int i=1; i<=2; ++i){
            System.out.println(bank.getCustomer(i));
        }*/
        bank.getCustomer(1).getAccount("OTP0000002").withdraw(800);
        //((CheckingAccount) bank.getCustomer(1).getAccount("OTP0000002")).withdraw(800);
        System.out.println(bank.getCustomer(1));
    }
}

// 2 balance, withdraw? ,    checking es saving 2 kulon account