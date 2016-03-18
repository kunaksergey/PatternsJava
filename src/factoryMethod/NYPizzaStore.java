package factoryMethod;

/**
 * Created by sa on 17.03.16.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
             return new NYCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYVeggiePizza();
        } else return null;
    }


}



