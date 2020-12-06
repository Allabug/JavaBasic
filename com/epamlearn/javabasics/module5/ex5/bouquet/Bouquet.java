package com.epamlearn.javabasics.module5.ex5.bouquet;

import com.epamlearn.javabasics.module5.ex5.flowers.Flower;
import lesson_inheritance.PriceCatalog;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bouquet {

    private List<Flower> flowersForBouquet = new ArrayList<>();
    private Wrap wrap;
    PriceCatalog priceCatalog = new PriceCatalog();

    public List<Flower> getFlowersForBouquet() {
        return flowersForBouquet;
    }

    public Wrap getWrap() {
        return wrap;
    }

    public void setFlowersForBouquet(List<Flower> flowersForBouquet) {
        this.flowersForBouquet = flowersForBouquet;
    }

    public void setWrap(Wrap packaging) {
        this.wrap = packaging;
    }


    @Override
    public String toString() {
        return "Bouquet: " + flowersForBouquet + "\n" + wrap;
    }
}
