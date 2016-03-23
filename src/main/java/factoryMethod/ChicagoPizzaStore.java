package factoryMethod;

/**
 * Created by sa on 17.03.16.
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String item) {

        if (item.equals("cheese")) {
            return new ChicagoCheesePizza();

        } else if (item.equals("veggie")) {
            return new ChicagoVeggiePizza();
        } else return null;

    }
}