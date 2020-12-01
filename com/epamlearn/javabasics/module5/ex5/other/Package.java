package com.epamlearn.javabasics.module5.ex5.other;

public enum Package {
    SATIN_RIBBON(new Price("5.00", "BYN")),
    GIFT_WRAP(new Price("10.00", "BYN")),
    FLOWER_BASKET(new Price("20.00", "BYN")),
    FLOWER_BOX(new Price("25.00", "BYN"));
    Price price;

    Package(Price price) {
        this.price = price;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  super.toString().replace('_', ' ').toLowerCase() + " " + price;
    }
}
