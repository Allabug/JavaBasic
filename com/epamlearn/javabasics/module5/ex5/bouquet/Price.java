package com.epamlearn.javabasics.module5.ex5.bouquet;

import java.math.BigDecimal;

public class Price {

    private String currency;
    private BigDecimal price;

    public Price() {
    }

    public Price(BigDecimal price, String currency) {
        this.currency = currency;
        this.price = price;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "price: " + price + " " + currency;
    }

}
