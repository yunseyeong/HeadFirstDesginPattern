package CompoundPatter2;
//goose adapter to bind Duck class
/*
한 class의 interface를 client에서 사용하고 하는 다른 interface로 변환한다.
adapter를 이용하면 interface의 호환성 문제 때문에 같이 사용할 수 없는 class를 쓸 수 있다.
 */
public class GooseAdapter implements Quackable {

    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
