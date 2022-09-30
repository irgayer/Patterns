import Drinks.Coke;
import Food.Fries;

public class Main {
    public static void main(String[] args) {
        EasyMeal easyMeal = new EasyMeal();
        easyMeal.setDrinkable(new Coke());
        easyMeal.setEatable(new Fries());

        easyMeal.eat();
    }
}