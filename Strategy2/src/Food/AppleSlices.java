package Food;

import Contracts.IEatable;

public class AppleSlices implements IEatable {
    @Override
    public void eat() {
        System.out.println("apple slices: eat with fork");
    }
}
