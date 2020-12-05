package com.epamlearn.javabasics.decomposition.ex15;

import java.util.ArrayList;
import java.util.List;

public class IncreasingSequence {

    public static List<Integer> getAllSequence(int n) {
        List<Integer> listSequence = new ArrayList<>();
        int numberOfIncreases = 9 - n;
        int[] number = getFirstNumber(n);
        int firstNumber = getNumberIntFromArray(number);
        listSequence.add(firstNumber);
        for (int i = 0; i < numberOfIncreases; i++) {
            int[] numIncrease = increaseNumber(number);
            number = numIncrease;
            int numInt = getNumberIntFromArray(numIncrease);
            listSequence.add(numInt);
        }
        return listSequence;
    }

    private static int[] getFirstNumber(int n) {
        int[] sequence = new int[n];
        int index = 0;
        for (int i = 0; i < sequence.length; i++) {
            index++;
            sequence[i] = index;
        }
        return sequence;
    }

    public static int[] increaseNumber(int[] number) {
        int[] numbersIncreased = new int[number.length];
        for (int i = 0; i < number.length; i++) {
            numbersIncreased[i] = number[i] + 1;
        }
        return numbersIncreased;
    }

    public static int getNumberIntFromArray(int[] arr) {
        StringBuilder strInt = new StringBuilder();
        for (int i : arr) {
             strInt.append(i);
        }
        String strNum = strInt.toString();
        int number = Integer.parseInt(strNum);
        return number;
    }

    public static void printListElement(List<Integer> list) {
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {

        printListElement(getAllSequence(2));
        printListElement(getAllSequence(3));
        printListElement(getAllSequence(4));
        printListElement(getAllSequence(5));
        printListElement(getAllSequence(6));
        printListElement(getAllSequence(7));
        printListElement(getAllSequence(8));
        printListElement(getAllSequence(9));
    }
}