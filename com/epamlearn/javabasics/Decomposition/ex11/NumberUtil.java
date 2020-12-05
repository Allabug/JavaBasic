package com.epamlearn.javabasics.decomposition.ex11;

public class NumberUtil {

    public static int getNumberOfDigits(long number) {
        int numberOfDigits = 0;

        if (number == 0) {
            numberOfDigits = 1;
        } else {
            while (number != 0) {
                number = number / 10;
                numberOfDigits++;
            }
        }
        return numberOfDigits;
    }

    public static long getNumberWithMoreDigits(long numb1, long numb2) {
        int numbDigits1 = getNumberOfDigits(numb1);
        int numDigits2 = getNumberOfDigits(numb2);
        if (numbDigits1 > numDigits2) {
            return numb1;
        } else {
            return numb2;
        }
    }

    public static void main(String[] args) {
        long num1 = 123456;
        long num2 = 123;
        long numbWithMoreDigits = getNumberWithMoreDigits(num1, num2);
        System.out.println("number with most digits = " + numbWithMoreDigits);
        num1 = 5;
        num2 = 20;
        long numbWithMoreDigits2 = getNumberWithMoreDigits(num1, num2);
        System.out.println("number with most digits = " + numbWithMoreDigits2);
    }
}
