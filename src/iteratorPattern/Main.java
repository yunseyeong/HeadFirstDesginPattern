package iteratorPattern;

public class Main {
	public static void main(String[] args) {
		FoodBook foodBook = new FoodBook(4);
		
		foodBook.appendFood(new Food("kimchi"));
		foodBook.appendFood(new Food("bulgogi"));
		foodBook.appendFood(new Food("bibimbab"));
		foodBook.appendFood(new Food("pizza"));
		
		Iterator iterator = foodBook.iterator();
		
		while(iterator.hasNext()){
			Food food = (Food)iterator.next();
			System.out.println(food.getName());
		}
	}
}
