package lab4_3;
import lab4_1.Person;

import java.util.Arrays;
import java.util.Random;
import static java.lang.Math.sqrt;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyArray {
    public int length;
    public double[] elements;

    //constructors
    public MyArray(int length) {
        this.length = length;
        elements = new double[this.length];
    }

    public MyArray(double[] array){
        this.length = array.length;
        elements = new double[this.length];
        System.arraycopy(array, 0, elements, 0, this.length);
    }

    public MyArray(String fileName){
        try (Scanner scanner = new Scanner(new File("labor-04/src/lab4_3/lab4_3_input.csv"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                this.length = Integer.parseInt(items[0].trim());
                elements = new double[this.length];
                for(int i=0; i<this.length; ++i){
                    elements[i] = Double.parseDouble(items[i+1].trim());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public MyArray(MyArray array){
        this.length = array.length;
        elements = new double[this.length];
        System.arraycopy(array.elements, 0, elements, 0, this.length);
    }

    //methods
    public void fillRandom(double a, double b){
        for (int i = 0; i < this.length; i++) {
            Random rand = new Random();
            elements[i] = rand.nextDouble(b-a) + a;
        }
    }

    public double mean(){
        double sum = 0;
        for (int i = 0; i < this.length; i++) {
            sum += elements[i];
        }
        return sum/this.length;
    }

    public double stddev(){
        double mean, sum1=0, sum2=0;

        for(int i=0; i<this.length; ++i){
            sum1 += elements[i];
        }
        mean = (double) sum1/ this.length;

        for(int i=0; i< this.length; ++i){
            sum2 += (mean - elements[i]) * (mean - elements[i]);
        }
        sum2 /= this.length;
        sum2 = sqrt(sum2);
        return sum2;
    }

    public void sort(){
        Arrays.sort(elements);
    }

    public void print(String arrayName){
        String result = arrayName + ": ";
        for (int i=0; i<this.length; ++i){
            result += String.format("%.2f", elements[i]) + ", ";
        }
        System.out.println(result);
    }
}
