package com.epamlearn.javabasics.module5.ex2;

import java.math.BigDecimal;

public class Price {

    private String price;
    private String currency;
    private BigDecimal priceBigDecimal;

    public Price() {
    }

    public Price(String price, String currency) {
        this.price = price;
        this.currency = currency;
        this.priceBigDecimal = new BigDecimal(price);
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public BigDecimal getPriceBigDecimal() {
        return priceBigDecimal;
    }

    public void setPriceBigDecimal(BigDecimal priceBigDecimal) {
        this.priceBigDecimal = priceBigDecimal;
    }

    @Override
    public String toString() {
        return "price: " + price + " " + currency;
    }
}
