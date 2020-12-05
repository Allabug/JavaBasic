package com.epamlearn.javabasics.decomposition.ex14;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumbers {

    public static List<Integer> getNumbersArmstrongInInterval(int k) {
        List<Integer> numbersArmstrong = new ArrayList<>();
        for (int i = 1; i < k; i++) {
            int lengthNum = getLengthNumber(i);
            int[] numbersOfDigit = getDigitsOfNumber(i, lengthNum);
            int sumNumbers = getSumNumbers(numbersOfDigit);
            int isArmstrong = (int) Math.pow(sumNumbers, lengthNum);
            if (i == isArmstrong) {
                numbersArmstrong.add(isArmstrong);
            }
        }
        return numbersArmstrong;
    }

    public static int getLengthNumber(int number) {
        int length = 0;
        while (number >= 1) {
            length++;
            number /= 10;
        }
        return length;
    }

    public static int[] getDigitsOfNumber(int number, int length) {
        int[] array = new int[length];
        int temp = number;
        for (int i = 0; i < length; i++) {
            array[i] = temp % 10;
            temp /= 10;
        }
        return array;
    }

    public static int getSumNumbers(int[] arr) {
        int sum = 0;
        for (int numb : arr) {
            sum += numb;
        }
        return sum;
    }

    public static void printArmstrongNumbers(List<Integer> list) {
        for (Integer num : list
        ) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {

        int k = 5000;
        List<Integer> list = getNumbersArmstrongInInterval(k);
        printArmstrongNumbers(list);
    }
}
