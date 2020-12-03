package com.epamlearn.javabasics.module5.ex4.treasure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Treasure implements Comparable<Treasure> {
    private String nameTreasure;
    private int cost;
    private String descriptionOfTreasure;

    public Treasure(String nameTreasure, int cost, String descriptionOfTreasure) {
        this.nameTreasure = nameTreasure;
        this.cost = cost;
        this.descriptionOfTreasure = descriptionOfTreasure;
    }

    public static class TreasurePlant {

        Treasure coin1 = new Coin("Caracalla", 50, "silver", "Roman Imperial",
                "A.D. 198-217. AR denarius. 3.08 gm. 18 mm. Struck A.D. 205.");
        Treasure coin2 = new Coin("Julia Domna", 20, "silver", "Roman Imperial",
                " Augusta, A.D. 193-217. AR denarius (17 mm, 6 h).");
        Treasure coin3 = new Coin("Vespasian", 45, "silver", "Roman Imperial",
                "AD 69-79. AR Denarius (17mm, 3.14 g, 7h).");
        Treasure coin4 = new Coin("Maximinus", 40, "silver", "Roman Imperial",
                "AD 236-238. MAXIMINVS PIVS AVG GERM, laureate, draped and cuirassed bust to right.");
        Treasure coin5 = new Coin("Trajan", 28, "silver", "Roman Imperial",
                "Trajan 98-117, Denarius, Rome, COS V P P SPQR OPTIMO PRINC, Spes standing, 3.39 g, RIC 127, RSC 84");

        Treasure gem1 = new Gem("Ruby", 43, "red", "precious stone");
        Treasure gem2 = new Gem("Emerald", 120, "green", "precious stone");
        Treasure gem3 = new Gem("Granate", 62, "black", "precious stone");
        Treasure gem4 = new Gem("Aquamarine", 38, "blue", "precious stone");
        Treasure gem5 = new Gem("Diamond", 200, "pink", "precious stone");

        Treasure jewelry1 = new Jewelry("ring", 120, "gold", "ancient ring with precious gems");
        Treasure jewelry2 = new Jewelry("bracelet", 36, "silver", "ancient bracelet with ruby");
        Treasure jewelry3 = new Jewelry("necklace", 365, "platina", "ancient necklace");
        Treasure jewelry4 = new Jewelry("pendant", 1200, "silver", "ancient pendant with diamond");
        Treasure jewelry5 = new Jewelry("brooch", 85, "gold", "ancient brooch with precious gems");

        Treasure weapon1 = new Weapon("dagger", 389, "Steel arms", "straight blade, sharpened on both sides");
        Treasure weapon2 = new Weapon("saber", 550, "Steel arms", "ancient weapon");
        Treasure weapon3 = new Weapon("musket", 150, "firearms", "pirate musket made of brass and wood");
        Treasure weapon4 = new Weapon("magic staff", 1200, "magic", "fire magic");
        Treasure weapon5 = new Weapon("magic wand", 750, "magik", "Avada Kedavra");

        public List<Treasure> fillTreasures() {
            List<Treasure> treasuresPlant = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                Collections.addAll(treasuresPlant, coin1, gem1, jewelry1, weapon1, coin5);
                Collections.addAll(treasuresPlant, gem2, coin2, jewelry2, weapon2, gem5);
                Collections.addAll(treasuresPlant, jewelry3, coin3, gem3, weapon3, jewelry5);
                Collections.addAll(treasuresPlant, weapon4, coin4, gem4, jewelry4, weapon5);
            }
            return treasuresPlant;
        }
    }

    public void setNameTreasure(String nameTreasure) {
        this.nameTreasure = nameTreasure;
    }

    public String getNameTreasure() {
        return nameTreasure;
    }

    public int getCost() {
        return cost;
    }

    public String getDescriptionOfTreasure() {
        return descriptionOfTreasure;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setDescriptionOfTreasure(String descriptionOfTreasure) {
        this.descriptionOfTreasure = descriptionOfTreasure;
    }

    @Override
    public int compareTo(Treasure o) {
        int result = cost - o.cost;
        int value = 0;
        if (result > 0) {
            value = 1;
        } else if (result < 0) {
            value = -1;
        }
        return value;
    }
}
