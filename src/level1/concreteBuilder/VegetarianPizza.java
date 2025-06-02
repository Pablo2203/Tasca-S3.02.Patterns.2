package level1.concreteBuilder;

import level1.builder.PizzaBuilder;
import level1.product.Pizza;

public class VegetarianPizza implements PizzaBuilder {
    Pizza pizza;

    @Override
    public void buildSize() {
    System.out.println("Adding vegetarian size...");
    }

    @Override
    public void buildDough() {
    System.out.println("Adding vegetarian dough...");
    }

    @Override
    public void buildToppings() {
    System.out.println("Adding vegetarian toppings...");
    }

    @Override
    public Pizza getPizza() {
        System.out.println("Vegetarian Pizza in progress...");
        return pizza;
    }
}
