package com.epamlearn.javabasics.module5.ex4.treasure;

public class Jewelry extends Treasure {
    private String kindOfMetal;

    public Jewelry(String nameTreasure, int cost, String kindOfMetal, String descriptionOfTreasure){
        super.setNameTreasure(nameTreasure);
        super.setCost(cost);
        super.setDescriptionOfTreasure(descriptionOfTreasure);
        this.kindOfMetal = kindOfMetal;
    }

    public void setKindOfMetal(String kindOfMetal) {
        this.kindOfMetal = kindOfMetal;
    }

    public String getKindOfMetal() {
        return kindOfMetal;
    }

    @Override
    public String toString() {
        return "Jewelry{" + "name: " + getNameTreasure() + ", cost:" + getCost() +
                ", metal: " + kindOfMetal + ", description: " + getDescriptionOfTreasure() +
                "} ";
    }
}
