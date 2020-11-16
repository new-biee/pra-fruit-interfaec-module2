package com.fruitinterface.fruit;

import com.fruitinterface.ebible.Edible;

public class Apple extends Fruit implements Edible {
    @Override
    public String color() {
        return "red";
    }

    @Override
    public String howToEat() {
        return "Apple could be slided";
    }
}
