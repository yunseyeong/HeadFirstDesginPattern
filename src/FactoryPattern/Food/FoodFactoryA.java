package FactoryPattern.Food;

public class FoodFactoryA implements FoodFactory {
    @Override
    public Fruit getFruitNameA() {
        return new apple();
    }

    @Override
    public Junk getJunkNameB() {
        return new Pizza();
    }
}
