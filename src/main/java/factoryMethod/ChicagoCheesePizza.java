package factoryMethod;

/**
 * Created by sa on 17.03.16.
 */
public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza() {
        name="Chicago Style Deep Dish Cheese Pizza";
        dough="Extra Thick Crust Dough";
        sauce="Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
