package abstractFactory.store;

import abstractFactory.differentPizza.*;
import abstractFactory.factories.*;

/**
 * Created by sa on 17.03.16.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        Pizza pizza = null;
        IngridientFactory ingredientFactory =
                new ChicagoIngridientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);

        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
        } else return null;
        return pizza;
    }
}
