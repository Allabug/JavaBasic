package com.epamlearn.javabasics.decomposition.ex9;

public class AreaOfQuadrangle {

    public double calculateArea(double x, double y, double z, double t) {
        double diagonal = Math.sqrt(x * x + y * y);
        double s1 = x * y / 2;
        double p = (diagonal + z + t) / 2;
        double s2 = Math.sqrt(p * (p - diagonal) * (p - z) * (p - t));
        double area = s1 + s2;
        return area;
    }

    public static void main(String[] args) {
        double x = 5;
        double y = 8;
        double z = 10;
        double t = 14;

        AreaOfQuadrangle quadrangle = new AreaOfQuadrangle();
        double area = quadrangle.calculateArea(x, y, z, t);
        System.out.println("Area = " + area);


    }
}
