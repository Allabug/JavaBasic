package com.epamlearn.javabasics.module5.ex4.cave;

import com.epamlearn.javabasics.module5.ex4.treasure.*;

import java.util.*;

public class Cave {

    private String name;
    private List<Treasure> treasures = new ArrayList<>();

    Treasure.TreasurePlant treasureFactory = new Treasure.TreasurePlant();

    public Cave(String name) {
        this.name = name;
        this.treasures = treasureFactory.fillTreasures();
    }

    public void showAllTreasures() {
        System.out.println(" All treasures from " + getName());
        for (Treasure treasure : treasures) {
            System.out.println(treasure);
        }
    }

    public void getMostExpensiveTreasures() {
        Set<Treasure> mostExpensiveTreasures = new HashSet<>();
        int highestCost = 0;
        for (Treasure treasure : treasures) {
            if (treasure.getCost() > highestCost) {
                highestCost = treasure.getCost();
            }
        }
        for (Treasure treasure1 : treasures) {
            if (treasure1.getCost() == highestCost) {
                mostExpensiveTreasures.add(treasure1);
            }
        }
        for (Treasure treasure : mostExpensiveTreasures) {
            if (treasure == null) {
                System.out.println("No treasure found");
            } else {
                System.out.println(treasure);
            }
        }
    }

    public int getMinPriceTreasure() {
        List<Treasure> sortTreasure = getTreasures();
        Collections.sort(sortTreasure);
        int minPrice = sortTreasure.get(0).getCost();
        return minPrice;
    }

    public void getTreasuresForGivenAmount(int setValue) {
        List<Treasure> treasuresForGivenAmount = new ArrayList<>();
        List<Treasure> sortTreasure = getTreasures();
        Collections.sort(sortTreasure);
        int tempSum = 0;
        for (Treasure t : sortTreasure) {
            tempSum += t.getCost();
            if (tempSum <= setValue) {
                treasuresForGivenAmount.add(t);
            }
        }
        for (Treasure treasure : treasuresForGivenAmount) {
            System.out.println(treasure);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTreasures(List<Treasure> treasures) {
        this.treasures = treasures;
    }

    public String getName() {
        return name;
    }

    public List<Treasure> getTreasures() {
        return treasures;
    }
}
