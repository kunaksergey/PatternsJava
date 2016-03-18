package abstractFactory.store;

import abstractFactory.differentPizza.Pizza;

/**
 * Created by sa on 17.03.16.
 */
abstract public class PizzaStore {

    public Pizza orderPizza(String item){
        Pizza pizza=createPizza(item);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    };

    abstract Pizza createPizza(String name);

}
