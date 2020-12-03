package com.epamlearn.javabasics.module5.ex4.treasure;

public class Coin extends Treasure {
    private String composition;
    private String mint;

    public Coin(String nameTreasure, int cost, String composition, String mint, String descriptionOfTreasure) {
       super(nameTreasure, cost, descriptionOfTreasure);
        this.composition = composition;
        this.mint = mint;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public void setMint(String mint) {
        this.mint = mint;
    }

    public String getComposition() {
        return composition;
    }

    public String getMint() {
        return mint;
    }

    @Override
    public String toString() {
        return "Coin{" + "name: " + getNameTreasure() + ",  cost: " + getCost() +
                ",  composition: " + composition + ",  mint: " + mint +
                ",  description: " + getDescriptionOfTreasure() + "} ";
    }
}
