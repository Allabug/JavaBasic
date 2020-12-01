package com.epamlearn.javabasics.module5.ex5.flowers;

import com.epamlearn.javabasics.module5.ex5.other.Price;

public class ExoticFlower extends Flower {
    private String type;
    private String countryOfOrigin;

    public ExoticFlower(String nameFlower, String colorFlower, Price priceFlower, String type, String countryOfOrigin) {
        super.setNameFlower(nameFlower);
        super.setColorFlower(colorFlower);
        super.setPriceFlower(priceFlower);
        this.type = type;
        this.countryOfOrigin = countryOfOrigin;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getType() {
        return type;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    @Override
    public String toString() {
        return super.toString() + ", type: " + type
                + ", country: " + countryOfOrigin + "}";
    }
}
