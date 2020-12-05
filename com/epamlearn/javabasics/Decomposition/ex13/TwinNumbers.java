package com.epamlearn.javabasics.decomposition.ex13;

public class TwinNumbers {

    private static int [][] findTwin (int n) {
        int [][] twinNumbers = new int[n - 1][2];
        for (int i = 0; i < twinNumbers.length; i++) {
            twinNumbers[i][0] = n + i;
            twinNumbers[i][1] = twinNumbers[i][0] + 2;
        }
        return twinNumbers;
    }

    private static void printMatrix (int [][] matrix) {  //вывод матрицы
        for (int[] array : matrix) {
            for (int element : array) {
                System.out.printf("%2d ", element);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int [][] twinNumbers = findTwin(n);

        printMatrix(twinNumbers);
    }
}
