package com.epamlearn.javabasics.module5.ex5.bouquet;

import com.epamlearn.javabasics.module5.ex5.flowers.Flower;

import java.math.BigDecimal;

public class PriceCalculator {

    Bouquet bouquet;

    public PriceCalculator(Bouquet bouquet) {
        this.bouquet = bouquet;
    }

    public String calculateTotalPraise() {
        BigDecimal sumTotal = BigDecimal.ZERO;
        for (Flower f : bouquet.getFlowersForBouquet()) {
            sumTotal = sumTotal.add(f.getPriceFlower().getPrice());
        }
        sumTotal = sumTotal.add(bouquet.getWrap().getPrice().getPrice());
        return sumTotal.toString() + " BYN";
    }


}
