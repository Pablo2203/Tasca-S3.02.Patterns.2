package level1;

import level1.builder.PizzaBuilder;
import level1.concreteBuilder.HawaiianPizza;
import level1.concreteBuilder.PepperoniPizza;
import level1.concreteBuilder.VegetarianPizza;
import level1.director.MestrePizzer;
import level1.product.Pizza;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PizzaBuilder hawaiianPizza = new HawaiianPizza();
        PizzaBuilder vegetarianPizza = new VegetarianPizza();
        PizzaBuilder pepperoniPizza = new PepperoniPizza();

        MestrePizzer mestrePizzer = new MestrePizzer(hawaiianPizza);
        MestrePizzer mestrePizzer2 = new MestrePizzer(vegetarianPizza);
        MestrePizzer mestrePizzer3 = new MestrePizzer(pepperoniPizza);

        Pizza pizzaA = mestrePizzer.prepareAPizza();
        System.out.println("-------------------------");

        Pizza pizzaB = mestrePizzer2.prepareAPizza();
        System.out.println("-------------------------");

        Pizza pizzaC = mestrePizzer3.prepareAPizza();


    }
}


