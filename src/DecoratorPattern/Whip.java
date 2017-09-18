package DecoratorPattern;

public class Whip extends CodimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage){this.beverage=beverage;}

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .1 + beverage.cost();
    }
}
