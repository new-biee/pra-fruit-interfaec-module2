package com.fruitinterface.fruit;

import com.fruitinterface.ebible.Edible;

public class Orange extends Fruit implements Edible {
    @Override
    public String color() {
        return "orange";
    }

    @Override
    public String howToEat() {
        return "Orange could be juiced";
    }
}
