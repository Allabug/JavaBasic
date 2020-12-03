package com.epamlearn.javabasics.module5.ex5.bouquet;

import com.epamlearn.javabasics.module5.ex5.flowers.FlowerStorage;

public class BouquetBuilder {
    private Bouquet bouquet = new Bouquet();
    private Wrap wrap;
    FlowerStorage flowerStorage = new FlowerStorage();

    public BouquetBuilder withFlower(int index) {
        bouquet.getFlowersForBouquet().add(flowerStorage.getFlowers().get(index));
        return this;
    }

    public BouquetBuilder withWrap(int index) {
        bouquet.setWrap(Wrap.values()[index]);
        return this;
    }

    public Bouquet build() {
        return bouquet;
    }
}
