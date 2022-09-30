package Drinks;

import Contracts.IDrinkable;

public class Coke implements IDrinkable {
    @Override
    public void drink() {
        System.out.println("Drinks.Coke: drink with straw");
    }
}
