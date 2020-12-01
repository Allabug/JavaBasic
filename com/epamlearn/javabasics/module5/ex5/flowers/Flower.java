package com.epamlearn.javabasics.module5.ex5.flowers;

import com.epamlearn.javabasics.module5.ex5.other.Price;

public class Flower {

    private String nameFlower;
    private String colorFlower;
    private Price priceFlower;

    public void setNameFlower(String nameFlower) {
        this.nameFlower = nameFlower;
    }

    public void setColorFlower(String colorFlower) {
        this.colorFlower = colorFlower;
    }

    public void setPriceFlower(Price priceFlower) {
        this.priceFlower = priceFlower;
    }

    public String getNameFlower() {
        return nameFlower;
    }

    public String getColorFlower() {
        return colorFlower;
    }

    public Price getPriceFlower() {
        return priceFlower;
    }

    @Override
    public String toString() {
        return "\nFlower{" + nameFlower + ", colorFlower: " + colorFlower + ", priceFlower: " + priceFlower +
                ", ";
    }
}