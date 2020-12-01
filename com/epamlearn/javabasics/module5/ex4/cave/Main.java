package com.epamlearn.javabasics.module5.ex4.cave;

import com.epamlearn.javabasics.module5.ex4.treasure.Coin;
import com.epamlearn.javabasics.module5.ex4.treasure.Treasure;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cave cave = new Cave("Viserion cave");

        cave.showAllTreasures();

        System.out.println("Number of treasure = " + cave.getTreasures().size() + "\n");

        System.out.println("The most expensive treasures in the cave: " + "\n");
        cave.getMostExpensiveTreasures();
        System.out.println(" ");

        System.out.println("Show treasures for a given amount. Enter an integer: ");
        try {
            Scanner scanner = new Scanner(System.in);
            int amount = scanner.nextInt();
            cave.getTreasuresForGivenAmount(amount);
        } catch (Exception ex) {
            System.out.println("You entered the wrong number");
        }
    }
}
