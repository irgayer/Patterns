import Contracts.IDrinkable;
import Contracts.IEatable;

public class EasyMeal {
    private IDrinkable drinkable;
    private IEatable eatable;

    public void eat() {
        drinkable.drink();
        eatable.eat();
    }

    public void setDrinkable(IDrinkable drinkable) {
        this.drinkable = drinkable;
    }

    public void setEatable(IEatable eatable) {
        this.eatable = eatable;
    }
}
