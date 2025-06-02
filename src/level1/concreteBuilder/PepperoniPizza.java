package level1.concreteBuilder;

import level1.builder.PizzaBuilder;
import level1.product.Pizza;

public class PepperoniPizza implements PizzaBuilder {
    Pizza pizza;

    @Override
    public void buildSize() {
        System.out.println("Adding pepperoni size...");

    }

    @Override
    public void buildDough() {
        System.out.println("Adding pepperoni dough...");
    }

    @Override
    public void buildToppings() {
        System.out.println("Adding pepperoni toppings...");
    }

    @Override
    public Pizza getPizza() {
        System.out.println("Pepperoni Pizza in progress...");
        return pizza;
    }
}
