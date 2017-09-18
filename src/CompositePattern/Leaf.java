package CompositePattern;

public class Leaf implements Component {

    private String name;

    public Leaf(String name){
        this.name=name;
    }

    @Override
    public void show() {
        System.out.println(name);
    }
}
