package factoryMethod;

import java.util.ArrayList;
import factoryMethod.ingridience.*;
/**
 * Created by sa on 17.03.16.
 */
abstract public class Pizza {
    protected String name;
    protected String sauce;
    protected String dough;
    protected ArrayList<String> toppings;

    public Pizza() {
        this.toppings = new ArrayList<>();
    }

    void prepare(){
        System.out.println("Готовка пицы");
    };
    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
    public String getName() {
        return name;
    }
}