package com.epamlearn.javabasics.module5.ex4.treasure;

public class Weapon extends Treasure {
    private String kindOfWeapon;

    public Weapon(String nameTreasure, int cost, String kindOfWeapon, String descriptionOfTreasure) {
        super.setNameTreasure(nameTreasure);
        super.setCost(cost);
        super.setDescriptionOfTreasure(descriptionOfTreasure);
        this.kindOfWeapon = kindOfWeapon;
    }

    public void setKindOfWeapon(String kindOfWeapon) {
        this.kindOfWeapon = kindOfWeapon;
    }

    public String getKindOfWeapon() {
        return kindOfWeapon;
    }

    @Override
    public String toString() {
        return "Weapon{" + "name: " + getNameTreasure() + ", cost: " + getCost() +
                ", kind of weapon: " + kindOfWeapon + ", description: " + getDescriptionOfTreasure()
                + "} ";
    }
}
