package com.epamlearn.javabasics.module5.ex5.bouquet;

import com.epamlearn.javabasics.module5.ex5.flowers.Flower;
import com.epamlearn.javabasics.module5.ex5.flowers.FlowerStorage;

import java.util.List;

public class BouquetBuilder {
    private Bouquet bouquet = new Bouquet();
    private Wrap wrap;
    FlowerStorage flowerStorage = new FlowerStorage();

    public BouquetBuilder withFlower(List<Flower> flowers) {
        bouquet.setFlowersForBouquet(flowers);
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
