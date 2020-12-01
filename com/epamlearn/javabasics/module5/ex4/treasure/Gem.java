package com.epamlearn.javabasics.module5.ex4.treasure;

public class Gem extends Treasure {
    private String colorOfGem;

    public Gem(String nameTreasure, int cost, String colorOfGem, String descriptionOfTreasure) {
        super.setNameTreasure(nameTreasure);
        super.setCost(cost);
        super.setDescriptionOfTreasure(descriptionOfTreasure);
        this.colorOfGem = colorOfGem;
    }

    public void setColorOfGem(String colorOfGem) {
        this.colorOfGem = colorOfGem;
    }

    public String getColorOfGem() {
        return colorOfGem;
    }

    @Override
    public String toString() {
        return "Gem{" + "name: " + getNameTreasure() + ", colorOfGem: " + colorOfGem +
                ", cost: " + getCost() + ", description: " + getDescriptionOfTreasure() +
                "} ";
    }
}
