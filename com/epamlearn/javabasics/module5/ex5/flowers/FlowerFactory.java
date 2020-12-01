package com.epamlearn.javabasics.module5.ex5.flowers;

import com.epamlearn.javabasics.module5.ex5.other.Price;

import java.util.ArrayList;
import java.util.Collections;

public class FlowerFactory {

    private ArrayList<Flower> flowers = new ArrayList<>();

    public FlowerFactory() {
        Collections.addAll(flowers, gardenRose, gardenTulip, gardenPion, gardenGerbera, gardenLily,
                exoticOrchid, exoticCalla, exoticAllium, exoticProtea, exoticEustoma);
    }

    Flower gardenRose = new GardenFlower("rose", "red", new Price("5.00", "BYN"), "garden flower");
    Flower gardenTulip = new GardenFlower("tulip", "yellow", new Price("4.50", "BYN"), "garden flower");
    Flower gardenPion = new GardenFlower("pion", "pink", new Price("10.00", "BYN"), "garden flower");
    Flower gardenGerbera = new GardenFlower("gerbera", "orange", new Price("6.50", "BYN"), "garden flower");
    Flower gardenLily = new GardenFlower("lily", "purple", new Price("12.00", "BYN"), "garden flower");

    Flower exoticOrchid = new ExoticFlower("orchid", "orange", new Price("15.00", "BYN"), "exotic flower", "Argentina");
    Flower exoticCalla = new ExoticFlower("calla", "black", new Price("14.50", "BYN"), "exotic flower", "Africa");
    Flower exoticAllium = new ExoticFlower("allium", "orange", new Price("16.00", "BYN"), "exotic flower", "Holland");
    Flower exoticProtea = new ExoticFlower("protea", "orange", new Price("20.00", "BYN"), "exotic flower", "China");
    Flower exoticEustoma = new ExoticFlower("eustoma", "orange", new Price("32.00", "BYN"), "exotic flower", "Taiwan");

    public void printAllFlowers() {
        int i = 1;
        for (Flower f : flowers) {
            System.out.println(i + "." + f.getNameFlower() + " ");
            i++;
        }
    }

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }
}
