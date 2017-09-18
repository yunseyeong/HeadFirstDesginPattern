package iteratorPattern;

public class FoodBookIterator implements Iterator{
	private FoodBook foodBook;
	
	private int index;
	
	public FoodBookIterator(FoodBook foodBook) {
		// TODO Auto-generated constructor stub
		this.foodBook=foodBook;
		this.index=0;
	}
	
	@Override
	public boolean hasNext() {
		return index < foodBook.getLength();
	}
	
	@Override
	public Object next() {
		Food food = foodBook.getFoodAt(index);
		index++;
		return food;
	}
}
