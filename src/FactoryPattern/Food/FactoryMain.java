package FactoryPattern.Food;

public class FactoryMain {
    public static void main(String[] args){
        FoodFactory FFA = new FoodFactoryA();
        FoodFactory FFB = new FoodFactoryB();

        FFA.getFruitNameA().fruitName();
        FFA.getJunkNameB().junkName();
        FFB.getFruitNameA().fruitName();
        FFB.getJunkNameB().junkName();
    }
}