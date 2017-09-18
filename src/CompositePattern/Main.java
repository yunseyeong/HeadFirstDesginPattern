package CompositePattern;

public class Main {
    public static void main(String[] args){
        Leaf leaf1 = new Leaf("leaf 1");
        Leaf leaf2 = new Leaf("leaf 2");
        Leaf leaf3 = new Leaf("leaf 3");

        Composite composite1 = new Composite();
        composite1.add(leaf1);

        Composite composite2 = new Composite();
        composite2.add(leaf2);
        composite2.add(leaf3);

        composite1.add(composite2);
        composite1.show();

        System.out.println("remove 1");
        composite1.remove(leaf1);
        composite1.show();

        System.out.println("remove composite 2");
        composite1.remove(composite2);
        composite1.show();

        System.out.println("print composite 2");
        composite2.show();
    }
}
