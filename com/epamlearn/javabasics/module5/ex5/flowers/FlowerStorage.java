package com.epamlearn.javabasics.module5.ex5.flowers;

import com.epamlearn.javabasics.module5.ex5.bouquet.Price;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlowerStorage {

    private List<Flower> flowers = new ArrayList<>();

    public FlowerStorage() {
        Collections.addAll(flowers, gardenRose, gardenTulip, gardenPion, gardenGerbera, gardenLily,
                exoticOrchid, exoticCalla, exoticAllium, exoticProtea, exoticEustoma);
    }

    Flower gardenRose = new GardenFlower("rose", "red", new Price(new BigDecimal("5.00"), "BYN"), "garden flower");
    Flower gardenTulip = new GardenFlower("tulip", "yellow", new Price(new BigDecimal("4.50"), "BYN"), "garden flower");
    Flower gardenPion = new GardenFlower("pion", "pink", new Price(new BigDecimal("10.00"), "BYN"), "garden flower");
    Flower gardenGerbera = new GardenFlower("gerbera", "orange", new Price(new BigDecimal("6.50"), "BYN"), "garden flower");
    Flower gardenLily = new GardenFlower("lily", "purple", new Price(new BigDecimal("12.00"), "BYN"), "garden flower");

    Flower exoticOrchid = new ExoticFlower("orchid", "orange", new Price(new BigDecimal("15.00"), "BYN"), "exotic flower", "Argentina");
    Flower exoticCalla = new ExoticFlower("calla", "black", new Price(new BigDecimal("14.50"), "BYN"), "exotic flower", "Africa");
    Flower exoticAllium = new ExoticFlower("allium", "orange", new Price(new BigDecimal("16.00"), "BYN"), "exotic flower", "Holland");
    Flower exoticProtea = new ExoticFlower("protea", "orange", new Price(new BigDecimal("20.00"), "BYN"), "exotic flower", "China");
    Flower exoticEustoma = new ExoticFlower("eustoma", "orange", new Price(new BigDecimal("32.00"), "BYN"), "exotic flower", "Taiwan");

    public void printAllFlowers() {
        int i = 1;
        for (Flower f : flowers) {
            System.out.println(i + "." + f.getNameFlower() + " ");
            i++;
        }
    }

    public List<Flower> getFlowers() {
        return flowers;
    }
}
