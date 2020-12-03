package com.epamlearn.javabasics.module5.ex5.bouquet;

import java.math.BigDecimal;

public enum Wrap {
    SATIN_RIBBON(new Price(new BigDecimal("5.00"), "BYN")),
    GIFT_WRAP(new Price(new BigDecimal("10.00"), "BYN")),
    FLOWER_BASKET(new Price(new BigDecimal("20.00"), "BYN")),
    FLOWER_BOX(new Price(new BigDecimal("25.00"), "BYN"));
    Price price;

    Wrap(Price price) {
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
        return super.toString().replace('_', ' ').toLowerCase() + " " + price;
    }
}
