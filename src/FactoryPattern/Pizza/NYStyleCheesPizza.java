package FactoryPattern.Pizza;

public class NYStyleCheesPizza extends Pizza{
    public NYStyleCheesPizza(){
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara sauce";

        toppings.add("Created Reggiano Cheese");
    }
}