package level1.concreteBuilder;

import level1.builder.PizzaBuilder;
import level1.product.Pizza;

public class HawaiianPizza implements PizzaBuilder {
    Pizza pizza;

    @Override
    public void buildSize() {
    System.out.println("Adding Hawaiian size...");
    }

    @Override
    public void buildDough() {
    System.out.println("Adding Hawaiian dough...");
    }

    @Override
    public void buildToppings() {
    System.out.println("Adding Hawaiian toppings...");
    }

    @Override
    public Pizza getPizza() {
        System.out.println("Hawaiian Pizza in progress...");
        return pizza;
    }

}
