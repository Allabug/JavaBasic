package com.epamlearn.javabasics.decomposition.ex6;

public class MutuallySimple {

    public int getNodThreeNumbers(int a1, int a2, int a3) {
        int d1 = getNod(a1, a2);
        int d2 = getNod(d1, a3);
        return d2;
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

    public boolean areMutuallySimple(int a, int b, int c) {
        int nod = getNodThreeNumbers(a, b, c);
        if (nod == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int a = 16;
        int b = 17;
        int c = 18;
        MutuallySimple mutuallySimple = new MutuallySimple();
        boolean areCoprime = mutuallySimple.areMutuallySimple(a, b, c);
        System.out.println("Numbers are coprime = " + areCoprime);
    }

}
