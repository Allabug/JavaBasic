package com.epamlearn.javabasics.module5.ex4.treasure;


public class Treasure implements Comparable<Treasure> {
    private String nameTreasure;
    private int cost;
    private String descriptionOfTreasure;

    public Treasure(String nameTreasure, int cost, String descriptionOfTreasure) {
        this.nameTreasure = nameTreasure;
        this.cost = cost;
        this.descriptionOfTreasure = descriptionOfTreasure;
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

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
