package CompoundPatter2;

//Decorator Pattern
/*
객체에 추가적인 요건을 동적으로 첨가한다.
subclass를 만드는 것을 통해서 기능을 유연하게 확장할 수 있는 방법을 제시
기존에 구현되어있던 class에 기능을 추가하기 위한 pattern
 */
public class QuackCounter implements Quackable{
    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }
}
