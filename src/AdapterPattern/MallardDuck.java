package AdapterPattern;

public class MallardDuck implements Duck{
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Quack");
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("I'm flying");
	}
}
