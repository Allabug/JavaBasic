package com.epamlearn.javabasics.decomposition.ex7;

import java.util.ArrayList;
import java.util.List;

public class FactorialSum {

    public List<Integer> getOddNumbers(int start, int end) {
        List<Integer> listOddNumbers = new ArrayList<>();
        while (start <= end) {
            if (!(start % 2 == 0)) {
                listOddNumbers.add(start);
            }
            start++;
        }
        return listOddNumbers;
    }

    private int factorial(int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorial(n - 1);
        return result;
    }

    public int sumFactorialsOddNumbers(int start, int end) {
        List<Integer> listOddNumber = getOddNumbers(start, end);
        int sumFactorial = 0;
        for (Integer numb : listOddNumber) {
            sumFactorial += factorial(numb);
        }
        return sumFactorial;
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 9;
        FactorialSum factorialSum = new FactorialSum();
        int sum = factorialSum.sumFactorialsOddNumbers(start, end);
        System.out.println("Sum of factorials of odd numbers from " + start + " to " + end + " = " + sum);

    }
}
