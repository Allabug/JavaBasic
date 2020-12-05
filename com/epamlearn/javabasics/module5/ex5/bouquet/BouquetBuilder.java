package com.epamlearn.javabasics.module5.ex5.bouquet;

import com.epamlearn.javabasics.module5.ex5.flowers.Flower;
import com.epamlearn.javabasics.module5.ex5.flowers.FlowerStorage;

public class BouquetBuilder {
    private Bouquet bouquet = new Bouquet();
    private Wrap wrap;
    FlowerStorage flowerStorage = new FlowerStorage();

    public BouquetBuilder withFlower(Flower flower) {
        bouquet.getFlowersForBouquet().add(flower);
        return this;
    }

    public BouquetBuilder withWrap(Wrap wrap) {
        bouquet.setWrap(wrap);
        return this;
    }

    public Bouquet build() {
        return bouquet;
    }
}
