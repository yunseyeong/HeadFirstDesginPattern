package iteratorPattern;


public class FoodBook implements Aggregate{
	private Food[] foods;
	private int last=0;

	public FoodBook(int maxsize){
		this.foods = new Food[maxsize];
	}

	public Food getFoodAt(int index){
		return foods[index];
	}

	public void appendFood(Food food){
		this.foods[last] = food;
		last++;
	}

	public int getLength(){
		return last;
	}
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new FoodBookIterator(this);
	}
}
