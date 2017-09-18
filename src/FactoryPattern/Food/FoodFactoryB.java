package FactoryPattern.Food;

public class FoodFactoryB implements FoodFactory {
    @Override
    public Fruit getFruitNameA() {
        return new grape();
    }

    @Override
    public Junk getJunkNameB() {
        return new Hamburger();
    }
}
