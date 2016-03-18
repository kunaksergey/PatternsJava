package abstractFactory;

import abstractFactory.store.*;
import abstractFactory.differentPizza.Pizza;


/**
 * Created by sa on 18.03.16.
 */
public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);
        System.out.println();
        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);
    }
}
