package level1.director;

import level1.builder.PizzaBuilder;
import level1.product.Pizza;

public class MestrePizzer {
    private PizzaBuilder pizzaBuilder;

    public MestrePizzer(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }
    public Pizza prepareAPizza(){
        this.pizzaBuilder.buildSize();
        this.pizzaBuilder.buildDough();
        this.pizzaBuilder.buildToppings();
        return this.pizzaBuilder.getPizza();


    }
}
