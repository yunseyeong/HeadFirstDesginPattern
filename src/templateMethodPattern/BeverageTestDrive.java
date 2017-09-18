package templateMethodPattern;

public class BeverageTestDrive {
	public static void main(String[] args) {
		TeaWithHook teaWithHook = new TeaWithHook();
		CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
		
		System.out.println("\n Making tea");
		teaWithHook.prepareRecipe();
		
		System.out.println("\nMaking coffee");
		coffeeWithHook.prepareRecipe();
	}
}
