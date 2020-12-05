package com.epamlearn.javabasics.module5.ex2;

import java.math.BigDecimal;

public class Price {

    private String currency;
    private BigDecimal priceProduct;

    public Price() {
    }

    public Price(BigDecimal price, String currency) {
        this.currency = currency;
        this.priceProduct = price;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setPriceProduct(BigDecimal priceProduct) {
        this.priceProduct = priceProduct;
    }

    public BigDecimal getPriceProduct() {
        return priceProduct;
    }

    @Override
    public String toString() {
        return "price: " + priceProduct + " " + currency;
    }
}
