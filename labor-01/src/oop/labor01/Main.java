package com.company;
import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
        String nev = "Csutak Peter";
        System.out.print(nev.charAt(0));
        for( int i=0; i<nev.length(); ++i){
            if (nev.charAt(i) == ' ')
                System.out.println(nev.charAt(i+1));
        }
        System.out.println();

        //

        String piramis = "ALMAFA";
        for(int i=0; i<piramis.length(); ++i){
            for(int j=0; j<=i; ++j){
                System.out.print(piramis.charAt(j));
            }
            System.out.println();
        }
        System.out.println();

        //

        String harmadik = "Kerekes Balint Adam Jozsef";
        String[] splitted = harmadik.split(" ");
        for (String name : splitted){
            System.out.print(name.charAt(0));
        }
        System.out.println();
        System.out.println();

        //

        double x[] ={7, 1, -3, 45, 9};
        System.out.printf("MAX of {7, 1, -3, 45, 9} : %6.2f\n", maxElement( x ));
        System.out.println();

        //

        /*int number=13, order=0;
        System.out.printf("%d\n", getBit(number, order));*/

        //

        //double array[] = new double[0];
        double array[] = {2, 6, -9, 19, 3.5};
        System.out.printf("mean of {2, 6, -9, 19, 3.5} : %.2f\n", mean(array));
        System.out.println();

        //

        //double array2[] = new double[0];
        double array2[] = {3, 4, 5.5, 9.5};
        System.out.printf("standard deviation of {3, 4, 5.5, 9.5} : %.2f\n", stddev(array2));
        System.out.println();

        //

        //double array3[] = new double[0];
        //double array3[] = {2};
        double array3[] = {2, 3, 7.2, 1, 8.34, 10.53, 1};
        double array4[] = max2(array3);
        System.out.print("2 highest values of {2, 3, 7, 1, 8, 10, 1} :\n");
        for(int j=0; j< array4.length; ++j){
            System.out.println(array4[j]);
        }
    }

    public static double maxElement( double array[] ){
        double max = Double.NEGATIVE_INFINITY;
        for( int i=0; i<array.length; ++i ){
            if( array[i] > max){
                max = array[ i ];
            }
        }
        return max;
    }

    /*public static byte getBit(int number, int order){
        for(int i=0; i<order; ++i){
            if(i==order-1){
                return number%2;
            }
            number /= 2;
        }
    }*/

    public static double mean(double array[]){
        double mean, sum=0;

        if(array.length == 0){
            return Double.NaN;
        }
        else {
            for (int i = 0; i < array.length; ++i) {
                sum += array[i];
            }
            mean = (double) sum / array.length;
            return mean;
        }
    }

    public static double stddev(double array2[]){
        double mean, sum1=0, sum2=0;

        if(array2.length == 0){
            return Double.NaN;
        }
        else{
            for(int i=0; i<array2.length; ++i){
                sum1 += array2[i];
            }
            mean = (double) sum1/ array2.length;

            for(int i=0; i< array2.length; ++i){
                sum2 += (mean - array2[i]) * (mean - array2[i]);
            }
            sum2 /= array2.length;
            sum2 = sqrt(sum2);
            return sum2;
        }
    }

    public static double[] max2( double array3[] ){
        double max[] ={Double.NEGATIVE_INFINITY,
                Double.NEGATIVE_INFINITY};
        if( array3.length == 0 ){
            for(int i=0; i<max.length; ++i){
                max[i] = Double.NaN;
            }
            return max;
        }
        if(array3.length == 1){
            for(int i=0; i<max.length; ++i){
                max[i] = array3[0];
            }
            return max;
        }

        max[1] = array3[0];
        for(int i=0; i< array3.length; ++i){
            if(array3[i] > max[1]){
                max[0] = max[1];
                max[1] = array3[i];
            }
            else if(array3[i] > max[0] && array3[i] != max[1]){
                max[0] = array3[i];
            }
        }
        return max;
    }
}
