package Drinks;

import Contracts.IDrinkable;

public class Coffee implements IDrinkable {
    @Override
    public void drink() {
        System.out.println("coffee: drink from cup");
    }
}
