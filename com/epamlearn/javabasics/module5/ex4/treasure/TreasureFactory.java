package com.epamlearn.javabasics.module5.ex4.treasure;

import java.util.ArrayList;
import java.util.Collections;

public class TreasureFactory {

    ArrayList<Treasure> treasuresFactory = new ArrayList<>();

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

    public ArrayList<Treasure> addTreasures() {
        for (int i = 0; i < 5; i++) {
            Collections.addAll(treasuresFactory, coin1, gem1, jewelry1, weapon1, coin5);
            Collections.addAll(treasuresFactory, gem2, coin2, jewelry2, weapon2, gem5);
            Collections.addAll(treasuresFactory, jewelry3, coin3, gem3, weapon3, jewelry5);
            Collections.addAll(treasuresFactory, weapon4, coin4, gem4, jewelry4, weapon5);
        }
        return treasuresFactory;
    }
}
