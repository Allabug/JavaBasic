package com.epamlearn.javabasics.decomposition.ex8;

public class SumOfElement {

    public static int getSumThreeElement(int[] array, int k) {
        int length = k + 2;
        int sum = 0;
        if (array.length >= length) {
            for (int i = k - 1; i < length; i++) {
                sum += array[i];
            }
        } else {
            return 0;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {5, 15, 30, -9, 6, 11, 7, 6, -3, 1, 3, 44};
        int k = 5;
        int sum = getSumThreeElement(array, k);
        System.out.println("Sum = " + sum);
    }
}
