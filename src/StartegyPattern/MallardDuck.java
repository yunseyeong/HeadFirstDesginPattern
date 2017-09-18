package StartegyPattern;

public class MallardDuck extends duck {
    public MallardDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm mallard duck");
    }
}
