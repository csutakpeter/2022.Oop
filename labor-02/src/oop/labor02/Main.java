package oop.labor02;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //bank account

        BankAccount account1 = new BankAccount("OTP00001");

        System.out.println(account1.getAccountNumber()+": "+account1.getBalance());
        account1.deposit(1000);
        System.out.println(account1.getAccountNumber()+": "+account1.getBalance());

        boolean result = account1.withdraw(500);
        if ( !result ){
            System.out.println("You do not have sufficient funds for this operation!");
        }
        System.out.println(account1.getAccountNumber()+": "+account1.getBalance());

        result = account1.withdraw(1000);
        if ( !result ){
            System.out.println("You do not have sufficient funds for this operation!");
        }
        System.out.println(account1.getAccountNumber()+": "+account1.getBalance());

        BankAccount account2 = new BankAccount("OTP00002");
        System.out.println(account2.getAccountNumber()+": "+account2.getBalance());
        account2.deposit(2000);
        System.out.println(account2.getAccountNumber()+": "+account2.getBalance());
        System.out.println();


        //rectangle

        Rectangle[] rectangles = new Rectangle[ 10 ];
        int totalArea = 0;

        for(int i=0; i<10; ++i) {
            Random rand = new Random();
            double length = 1 + rand.nextInt(10);
            double width = 1 + rand.nextInt(10);
            rectangles[i] = new Rectangle(length, width);

            System.out.println("Rectangle nr." + (i+1) +":");
            System.out.println("length: " + rectangles[i].getLength());
            System.out.println("width: " + rectangles[i].getWidth());
            System.out.println("perimeter: " + rectangles[i].perimeter());
            System.out.println("area: " + rectangles[i].area());
            System.out.println();
            totalArea += rectangles[i].area();
        }
        System.out.println("Total area: " + totalArea);
        System.out.println();


        //DateUtil

        /*System.out.println(DateUtil.isValidDate(2000,2, 29) == true);
        System.out.println(DateUtil.isValidDate(2000,2, 30) == false);
        System.out.println(DateUtil.isValidDate(1900,2, 29) == false);
        System.out.println(DateUtil.isValidDate(1900,2, 28) == true);
        System.out.println(DateUtil.isValidDate(-1900,2, 28) == false);
        System.out.println(DateUtil.isValidDate(0,2, 28) == false);
        System.out.println(DateUtil.isValidDate(2021,2, 29) == false);
        System.out.println(DateUtil.isValidDate(2020,2, 29) == true);
        System.out.println(DateUtil.isValidDate(2020,1, 32) == false);
        System.out.println(DateUtil.isValidDate(2020,1, 0) == false);
        System.out.println(DateUtil.isValidDate(2020,0, 0) == false);
        System.out.println(DateUtil.isValidDate(2020,4, 31) == false);
        System.out.println(DateUtil.isValidDate(2020,1, 31) == true);*/

        //test
        //System.out.println(DateUtil.isValidDate(4,4, 30));

        MyDate[] dates = new MyDate[1000];
        int invalidCount = 0;

        for(int i=0; i<1000; ++i){
            Random rand = new Random();
            int year = rand.nextInt(9999);
            int month = rand.nextInt(13);
            int day =  rand.nextInt(32);
            dates[i] = new MyDate(year, month, day);

            if(DateUtil.isValidDate(year, month, day) == true){
                System.out.println("date nr." + i + ": " + dates[i].toString());
            }
            else invalidCount++;
        }
        System.out.println();
        System.out.println("Number of invalid dates: " + invalidCount);

    }
}

