package com.epamlearn.javabasics.decomposition.ex2;

public class ArithmeticOperations {

    public int getNodFourNumbers(int a1, int a2, int a3, int a4) {
        int d1 = getNod(a1, a2);
        int d2 = getNod(d1, a3);
        int d3 = getNod(d2, a4);
        return d3;
    }

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

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 12;
        int n3 = 6;
        int n4 = 20;
        ArithmeticOperations obj = new ArithmeticOperations();
        int nodFourNum = obj.getNodFourNumbers(n1, n2, n3, n4);
        System.out.println("НОД для четырех чисел будет равен = " + nodFourNum);
    }
}
