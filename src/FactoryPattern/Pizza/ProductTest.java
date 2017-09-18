package FactoryPattern.Pizza;

public class ProductTest {
    public static void main(String[] args){
        Product t1 = ProductFactory.getProduct("ticket", "한국여행", 300000);
        Product c1 = ProductFactory.getProduct("computer", "pc", 150000);

        System.out.println(t1.toString());
        System.out.println(c1.toString());

    }
}
