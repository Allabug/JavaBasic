package com.epamlearn.javabasics.decomposition.ex1;

public class ArithmeticOperations {
    public int getNod(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        a += b;

        return a;
    }

    public int getNok(int x, int y) {
        x = Math.abs(x);
        y = Math.abs(y);
        int a = x;
        int b = y;
        if (x != y) {
            while (x != y) {
                if (x > y) {
                    y += b;
                } else {
                    x += a;
                }
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        ArithmeticOperations arithmetic = new ArithmeticOperations();
        int nodNum = arithmetic.getNod(a, b);
        System.out.println("НОД чисел а и b = " + nodNum);
        int nokNum = arithmetic.getNok(a, b);
        System.out.println("НОК чисел а и b = " + nokNum);
    }
}