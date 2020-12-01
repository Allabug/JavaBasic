package com.epamlearn.javabasics.module5.ex5.other;

import com.epamlearn.javabasics.module5.ex5.flowers.Flower;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Bouquet {

    private ArrayList<Flower> flowersForBouquet = new ArrayList<>();
    private Package packaging;
    private Price totalPrice = new Price();

    public ArrayList<Flower> getFlowersForBouquet() {
        return flowersForBouquet;
    }

    public Package getPackaging() {
        return packaging;
    }

    public void setFlowersForBouquet(ArrayList<Flower> flowersForBouquet) {
        this.flowersForBouquet = flowersForBouquet;
    }

    public void setPackaging(Package packaging) {
        this.packaging = packaging;
    }

    public void calculateTotalPraise() {
        BigDecimal sumTotal = BigDecimal.ZERO;
        for (Flower f : flowersForBouquet) {
            sumTotal = sumTotal.add(f.getPriceFlower().getPriceBigDecimal());
        }
        sumTotal = sumTotal.add(packaging.getPrice().getPriceBigDecimal());
        this.totalPrice.setPrice(sumTotal.toString());
        this.totalPrice.setCurrency("BYN");
    }

    public void setTotalPrice(Price totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Price getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Bouquet: " + flowersForBouquet + "\n" + packaging;
    }
}
