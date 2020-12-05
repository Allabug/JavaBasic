package com.epamlearn.javabasics.decomposition.ex12;

import java.util.Arrays;

public class ArrayUtils {

    public static int[] getFilledArray(int k) {
        int[] arr = new int[k];
        int index = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int sum = i + j;
                if (sum == k) {
                    String numbStr = "" + i + j;
                    int numbInt = Integer.parseInt(numbStr);
                    arr[index] = numbInt;
                    index++;
                }
            }
        }
        return arr;
    }

    public static int getLengthForResultArray(int[] arr, int n) {
        int length = 0;
        for (int number : arr) {
            if (number <= n) {
                length++;
            }
        }
        return length;
    }

    public static int[] getResultArray(int k, int n) {
        int[] filledArray = getFilledArray(k);
        int lengthResultArr = getLengthForResultArray(filledArray, n);
        int[] resultArray = new int[lengthResultArr];
        int index = 0;
        for (int i = 0; i < filledArray.length; i++) {
            if (filledArray[i] <= n) {
                resultArray[index] = filledArray[i];
                index++;
            }
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int k = 10;//программа работает для чисел K от 0 до 9
        int n = 300;
        int[] resultArray = getResultArray(k, n);
        System.out.println(Arrays.toString(resultArray));
        System.out.println();
    }
}
