package level1.builder;

import level1.product.Pizza;

public interface PizzaBuilder {
    void buildSize();
    void buildDough();
    void buildToppings();
    Pizza getPizza();
}

