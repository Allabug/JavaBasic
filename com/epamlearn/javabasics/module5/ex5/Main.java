package com.epamlearn.javabasics.module5.ex5;

import com.epamlearn.javabasics.module5.ex5.flowers.FlowerFactory;
import com.epamlearn.javabasics.module5.ex5.other.Bouquet;
import com.epamlearn.javabasics.module5.ex5.other.Package;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();
        String userInput;
        int packageIndex = 1;
        boolean isPackage = false;
        boolean choiceOfPackage = false;
        String inputPackage = "pack";
        int userInputInt;
        FlowerFactory flowerFactory = new FlowerFactory();

        Scanner scanner = new Scanner(System.in);
        System.out.println("List of available flowers for bouquet composition:");
        flowerFactory.printAllFlowers();

        System.out.println("\nTo add flowers to the bouquet, enter the flower number: ");
        System.out.println("To pack the bouquet and choose the type of packaging, enter: " + inputPackage);
        while (!isPackage) {
            userInput = scanner.nextLine();
            if (userInput.trim().toLowerCase().equals(inputPackage)) {
                isPackage = true;
            } else {
                try {
                    userInputInt = Integer.parseInt(userInput);
                    if (userInputInt <= flowerFactory.getFlowers().size()) {
                        int index = userInputInt - 1;
                        bouquet.getFlowersForBouquet().add(flowerFactory.getFlowers().get(index));
                    } else if (userInputInt > flowerFactory.getFlowers().size()) {
                        System.out.println("Wrong number entered. Enter flower number: ");
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("Wrong option!. Try again!");
                }
            }
        }
        System.out.println("Select packaging: ");
        for (Package p : Package.values()) {
            System.out.println(packageIndex + "." + p.toString());
            packageIndex++;
        }
        while (!choiceOfPackage) {
            userInput = scanner.nextLine();
            try {
                userInputInt = Integer.parseInt(userInput);
                if (userInputInt <= Package.values().length) {
                    int index = userInputInt - 1;
                    bouquet.setPackaging(Package.values()[index]);
                    choiceOfPackage = true;
                } else {
                    System.out.println("Wrong number entered. Enter package number: ");
                }
            } catch (Exception ex) {
                System.out.println("Wrong option!. Try again!");
            }
        }

        System.out.println("Your bouquet is ready!");
        System.out.println(bouquet);
        bouquet.calculateTotalPraise();
        System.out.println("\nThe cost of a bouquet with packaging: " + "\n" + bouquet.getTotalPrice());
    }
}
