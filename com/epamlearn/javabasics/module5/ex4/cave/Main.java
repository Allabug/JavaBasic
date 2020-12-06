package com.epamlearn.javabasics.module5.ex4.cave;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cave cave = new Cave("Viserion cave");

        cave.showAllTreasures();

        System.out.println("Number of treasure = " + cave.getTreasures().size() + "\n");

        System.out.println("The most expensive treasures in the cave: " + "\n");
        cave.showMostExpensiveTreasures();
        System.out.println(" ");

        System.out.println("Show treasures for a given amount. Enter an integer: ");
        System.out.println("To exit the program, enter any negative number: ");

        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;

        while (isTrue) {
            String amount = scanner.nextLine();
            int amountInt;
            try {
                amountInt = Integer.parseInt(amount);
                int minPrice = cave.getMinPriceTreasure();
                if (amountInt > minPrice) {
                    cave.showTreasuresForGivenAmount(amountInt);
                    isTrue = false;
                } else if (amountInt == 1) {
                    System.out.println("We do not have so cheap treasures");
                } else if (amountInt < 0) {
                    System.exit(1);
                } else {
                    System.out.println("We do not have so cheap treasures. Please enter a number greater than " + minPrice);
                }
            } catch (NumberFormatException ex) {
                System.out.println("You entered not a number. Enter integer: ");
            }
        }
    }
}
