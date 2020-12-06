package com.epamlearn.javabasics.module5.ex5.bouquet;

import com.epamlearn.javabasics.module5.ex5.flowers.Flower;


import java.util.ArrayList;
import java.util.List;

public class Bouquet {

    private List<Flower> flowersForBouquet = new ArrayList<>();
    private Wrap wrap;


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
