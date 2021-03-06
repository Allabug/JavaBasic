package com.epamlearn.javabasics.module5.ex5.flowers;

import com.epamlearn.javabasics.module5.ex5.bouquet.Price;

public class GardenFlower extends Flower {
    private String type;

    public GardenFlower(String nameFlower, String colorFlower, Price priceFlower, String type) {
        super(nameFlower, colorFlower, priceFlower);
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString() + "type: " + type + " }";
    }
}
