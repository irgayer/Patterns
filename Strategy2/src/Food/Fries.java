package Food;

import Contracts.IEatable;

public class Fries implements IEatable {
    @Override
    public void eat() {
        System.out.println("fries: eat with fingers");
    }
}
