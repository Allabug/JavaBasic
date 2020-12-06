package com.epamlearn.javabasics.module5.ex5;

import com.epamlearn.javabasics.module5.ex5.bouquet.Bouquet;
import com.epamlearn.javabasics.module5.ex5.bouquet.PriceCalculator;

public class Main {

    public static void main(String[] args) {

        Bouquet bouquet;

        UserInputUtils userInputUtils = new UserInputUtils();

        bouquet = userInputUtils.handleUserInputForFlowers().handleUserInputForWrap().build();

        PriceCalculator priceCalculator = new PriceCalculator(bouquet);

        System.out.println("Your bouquet is ready!");
        System.out.println(bouquet);
        System.out.println("\nThe cost of a bouquet with packaging: " + "\n" + priceCalculator.calculateTotalPraise());
    }
}
