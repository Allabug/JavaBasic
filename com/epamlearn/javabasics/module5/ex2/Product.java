package com.epamlearn.javabasics.module5.ex2;

public class Product {
    private String name;
    private String id;
    private Price productPrice;

    public Product(String name, String id, Price productPrice) {
        this.name = name;
        this.id = id;
        this.productPrice = productPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Price getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Price productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "product name: " + name + "\n" + "product id: " + id + " " + productPrice;
    }
}
