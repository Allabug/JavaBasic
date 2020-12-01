package com.epamlearn.javabasics.module5.ex4.cave;


import com.epamlearn.javabasics.module5.ex4.treasure.Treasure;
import com.epamlearn.javabasics.module5.ex4.treasure.TreasureFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Cave {
    private String nameCave;
    private ArrayList<Treasure> treasures = new ArrayList<>();

    TreasureFactory treasureFactory = new TreasureFactory();

    public Cave(String nameCave) {
        this.nameCave = nameCave;
        this.treasures = treasureFactory.addTreasures();
    }

    public void showAllTreasures() {
        System.out.println(" All treasures from " + getNameCave());
        for (Treasure treasure : treasures) {
            System.out.println(treasure);
        }
    }

    public void getMostExpensiveTreasures() {
        HashSet<Treasure> mostExpensiveTreasures = new HashSet<>();
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

    public void getTreasuresForGivenAmount(int setValue) {
        ArrayList<Treasure> treasuresForGivenAmount = new ArrayList<>();
        ArrayList<Treasure> sortTreasure = getTreasures();
        Collections.sort(sortTreasure);
        int tempSum = 0;
        for (Treasure t : sortTreasure) {
            tempSum += t.getCost();
            if (tempSum <= setValue) {
                treasuresForGivenAmount.add(t);
            }
        }

        if (treasuresForGivenAmount.size() == 0) {
            System.out.println("No treasure found. maybe the amount is too small");
        }

        for (Treasure treasure : treasuresForGivenAmount) {
            System.out.println(treasure);
        }
    }

    public void setNameCave(String nameCave) {
        this.nameCave = nameCave;
    }

    public void setTreasures(ArrayList<Treasure> treasures) {
        this.treasures = treasures;
    }

    public String getNameCave() {
        return nameCave;
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }
}
