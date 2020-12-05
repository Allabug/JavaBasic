package com.epamlearn.javabasics.decomposition.ex10;

import java.util.Arrays;

public class ArrayOfNumber {

    public static int getLengthArray(long numb) {
        int length = 0;
        if (numb == 0) {
            length = 1;
        } else {
            while (numb != 0) {
                numb = numb / 10;
                length++;
            }
        }
        return length;
    }

    public static long[] getArrayFromNumber(long number) {
        int lengthArr = getLengthArray(number);
        long[] array = new long[lengthArr];
        for (int i = 0; i < array.length; i++) {
            array[i] = number % 10;
            number = number / 10;
        }
        return array;
    }

    public static void main(String[] args) {
        long number = 2147483647;

        long[] arrayFromNumber = getArrayFromNumber(number);
        System.out.println(Arrays.toString(arrayFromNumber));
    }
}
