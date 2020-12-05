package com.epamlearn.javabasics.decomposition.ex5;

public class SecondMaxNumber {

    public static int getSecondMaxNumber(int[] arr) {
        int[] sortedArray = sortingArray(arr);
        int secondMaxNum;
        int index = sortedArray.length - 2;
        secondMaxNum = sortedArray[index];
        return secondMaxNum;
    }

    public static int[] sortingArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minInd = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minInd]) {
                    minInd = j;
                }
            }
            int temp = arr[minInd];
            arr[minInd] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void printSecondMaxNumber(int number) {
        System.out.println("The second largest number in the array = " + number);
    }

    public static void main(String[] args) {
        int[] array = {5, 10, 20, 9, 11, 44, 6, 1};

        int secondMaxNumber = getSecondMaxNumber(array);
        printSecondMaxNumber(secondMaxNumber);


    }
}
