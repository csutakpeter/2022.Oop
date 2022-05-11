package lab6_2;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    public double[][] data;
    public int rows;
    public int columns;

    //consturctors
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new double[rows][columns];
    }

    public Matrix(double[][] data) {
        this.data = data;
        this.rows = data.length;
        this.columns = data[0].length;
    }

    public Matrix(Matrix matrix) {
        this.rows = matrix.rows;
        this.columns = matrix.columns;
        this.data = matrix.data;
    }

    //getters
    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    //methods
    public void fillRandom(double rows, double columns) {
        Random rand = new Random();
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                data[i][j] = rand.nextInt(1, 10);
            }
        }
    }

    public void printMatrix() {
        System.out.println(Arrays.deepToString(data));
    }

    public static Matrix add(Matrix matrix1, Matrix matrix2) {
        if(matrix1.data.length == matrix2.data.length && matrix1.data[0].length == matrix2.data[0].length){
            Matrix buffer = new Matrix(matrix1.data.length, matrix1.data[0].length);
            for (int i = 0; i < matrix1.data.length; i++) {
                for (int j = 0; j < matrix1.data[0].length; j++) {
                    buffer.data[i][j] = matrix1.data[i][j] + matrix2.data[i][j];
                }
            }
            return buffer;
        }
        else{
            System.out.println("The matrices have different dimensions:");
            return null;
        }
    }

    public static Matrix multiply(Matrix matrix1, Matrix matrix2) {
        if(matrix1.data.length == matrix2.data.length && matrix1.data[0].length == matrix2.data[0].length){
            Matrix buffer = new Matrix(matrix1.data.length, matrix1.data[0].length);
            for(int i = 0; i < matrix1.data.length; i++){
                for(int j = 0; j < matrix1.data[0].length; j++){
                    buffer.data[i][j] = 0;
                    for(int k = 0; k < matrix1.data.length; k++){
                        buffer.data[i][j] += matrix1.data[i][k] * matrix2.data[k][j];
                    }
                }
            }
            return buffer;
        }
        else{
            System.out.println("The matrices have different dimensions:");
            return null;
        }
    }

    public static Matrix transpose(Matrix matrix1) {
            Matrix buffer = new Matrix(matrix1.data[0].length, matrix1.data.length);
            for(int i = 0; i < matrix1.data.length; i++){
                for(int j = 0; j < matrix1.data[0].length; j++){
                    buffer.data[j][i] = matrix1.data[i][j];
                }
            }
            return buffer;
    }
}