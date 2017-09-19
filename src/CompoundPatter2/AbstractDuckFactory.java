package CompoundPatter2;

//abstract factory pattern
//구체적인 클래스를 지정하지 않고 관련성을 갖는 객체들의 집합을 생성하거나
//서로 독립적인 객체들의 집합을 생성할 수 있는 인터페이스를 제공한다.
public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
