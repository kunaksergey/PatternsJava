package abstractFactory.differentPizza;

import abstractFactory.factories.IngridientFactory;
import abstractFactory.ingridients.absctractIngridients.*;

import java.util.ArrayList;

/**
 * Created by sa on 18.03.16.
 */
abstract public class Pizza {
    protected String name;
    protected Sauce sauce;
    protected Dough dough;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clam clam;
    protected IngridientFactory ingridientFactory;

    public Pizza(IngridientFactory ingridientFactory) {

        this.ingridientFactory=ingridientFactory;
    }

    public abstract void prepare();
    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public  void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", sauce=" + sauce +
                ", dough=" + dough +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clam=" + clam +
                '}';
    }
}
