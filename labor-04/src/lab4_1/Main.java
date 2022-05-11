package lab4_1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readFilePrintItsLineNumbered("lab4_1_input.txt");
        ArrayList<Person> persons=readFromCSVFile("lab4_1.input.csv");
        for(Person person:persons){
            System.out.println(person);
        }
    }

    public static void readFilePrintItsLineNumbered( String fileName ){
        try (Scanner scanner = new Scanner( new File("labor-04/src/lab4_1/lab4_1_input.txt"))){
            int i=1;
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(i + " " + line);
                ++i;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Person> readFromCSVFile(String fileName) {
        ArrayList<Person> persons = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("labor-04/src/lab4_1/lab4_1_input.csv"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
// trim: eliminates leading and trailing spaces
                String firstName = items[0].trim();
                String lastName = items[1].trim();
// Convert String → int: Integer.parseInt( String)
                int birtYear = Integer.parseInt(items[2].trim());
                persons.add(new Person(firstName, lastName, birtYear));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return persons;
    }
}