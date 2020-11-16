package com.fruitinterface;

import com.fruitinterface.fruit.Apple;
import com.fruitinterface.fruit.Fruit;
import com.fruitinterface.fruit.Orange;

public class Main {

    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.color());
            if (fruit instanceof Apple) {
                Apple edible = (Apple) fruit;
                System.out.println(edible.howToEat());
            } else if (fruit instanceof Orange) {
                Orange orange = (Orange) fruit;
                System.out.println(orange.howToEat());
            }
        }
    }
}
