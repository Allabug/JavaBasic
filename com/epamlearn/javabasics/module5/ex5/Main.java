package com.epamlearn.javabasics.module5.ex5;

import com.epamlearn.javabasics.module5.ex5.flowers.FlowerStorage;

import com.epamlearn.javabasics.module5.ex5.bouquet.Bouquet;
import com.epamlearn.javabasics.module5.ex5.bouquet.BouquetBuilder;
import com.epamlearn.javabasics.module5.ex5.bouquet.Wrap;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        FlowerStorage flowerStorage = new FlowerStorage();
        BouquetBuilder builder = new BouquetBuilder();

        Scanner scanner = new Scanner(System.in);
        System.out.println("List of available flowers for bouquet composition:");
        flowerStorage.printAllFlowers();

        System.out.println("\nTo add flowers to the bouquet, enter the flower number: ");
        String inputWrap = "pack";
        System.out.println("To pack the bouquet and choose the type of packaging, enter: " + inputWrap);
        System.out.println("To exit the program, enter: exit");
        boolean isPackage = false;
        String userInput;
        int userInputInt;
        while (!isPackage) {
            userInput = scanner.nextLine();
            if (userInput.trim().toLowerCase().equals(inputWrap)) {
                isPackage = true;
            } else if (userInput.trim().toLowerCase().equals("exit")) {
                System.exit(0);
            } else {
                try {
                    userInputInt = Integer.parseInt(userInput);
                    if (userInputInt <= 0) {
                        System.out.println("Please enter a number greater than 0: ");
                    } else if (userInputInt <= flowerStorage.getFlowers().size()) {
                        int index = userInputInt - 1;
                        builder.withFlower(flowerStorage.getFlowers().get(index));
                    } else if (userInputInt > flowerStorage.getFlowers().size()) {
                        System.out.println("Wrong number entered. Enter flower number: ");
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("Wrong option!. Try again!");
                }
            }
        }
        System.out.println("Select packaging: ");
        int packageIndex = 1;
        for (Wrap p : Wrap.values()) {
            System.out.println(packageIndex + "." + p.toString());
            packageIndex++;
        }
        boolean choiceOfWrap = false;
        while (!choiceOfWrap) {
            userInput = scanner.nextLine();
            try {
                userInputInt = Integer.parseInt(userInput);
                if (userInputInt <= Wrap.values().length) {
                    int index = userInputInt - 1;
                    builder.withWrap(Wrap.values()[index]);
                    choiceOfWrap = true;
                } else {
                    System.out.println("Wrong number entered. Enter package number: ");
                }
            } catch (Exception ex) {
                System.out.println("Wrong option!. Try again!");
            }
        }
        Bouquet bouquet = builder.build();
        System.out.println("Your bouquet is ready!");
        System.out.println(bouquet);
        System.out.println("\nThe cost of a bouquet with packaging: " + "\n" + bouquet.calculateTotalPraise());
    }
}
