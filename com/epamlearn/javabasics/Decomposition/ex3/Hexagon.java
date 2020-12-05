package com.epamlearn.javabasics.decomposition.ex3;

public class Hexagon {
    public double getArea(double a) {
        double area = Math.pow(a, 2) * ((3 * Math.sqrt(3)) / 2);
        return area;
    }

    public static void main(String[] args) {
        double side = -5.0;
        Hexagon hexagon = new Hexagon();
        double area = hexagon.getArea(side);
        System.out.println("Площадь равностороннего шестиугольника равна = " + area);
    }
}
