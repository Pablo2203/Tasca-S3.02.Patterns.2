package level1.concreteBuilder;

import level1.builder.PizzaBuilder;
import level1.product.Pizza;

public class HawaiianPizza implements PizzaBuilder {
    Pizza pizza;

    @Override
    public void buildSize() {

    }

    @Override
    public void buildDough() {

    }

    @Override
    public void buildToppings() {

    }

    @Override
    public Pizza getPizza() {
        System.out.println("Hawaiian Pizza in progress...");
        return pizza;
    }

}
