package lab4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = readFromCsvFile("lab4_2_input.csv");
        for(Customer customer : customers){
            System.out.println(customer);
        }
    }

    public static ArrayList<Customer> readFromCsvFile(String fileName) {
        ArrayList<Customer> customers = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("labor-04/src/lab4_2/lab4_2_input.csv"))) {
            String firstName = null;
            String lastName = null;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");

                String test = items[0].trim();
                if(test.equals("Customer")){
                    firstName = items[1].trim();
                    lastName = items[2].trim();
                    customers.add(new Customer(firstName, lastName));
                }

                if(test.equals("Account")){
                    String accountNumber = items[1].trim();
                    int sum = Integer.parseInt(items[2].trim());
                    for(Customer customer : customers){
                        if (customer.getFirstName().equals(firstName) && customer.getLastName().equals(lastName)){
                            customer.addAccount(accountNumber);
                            customer.getAccount(accountNumber).deposit(sum);
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return customers;
    }
}
