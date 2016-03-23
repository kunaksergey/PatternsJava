package abstractFactory.factories;
import abstractFactory.ingridients.absctractIngridients.*;
/**
 * Created by sa on 18.03.16.
 */
public interface IngridientFactory {
    public Sauce createSouce();
    public Dough createDough();
    public Cheese createCheese();
    public Pepperoni reatePepperoni();
    public Clam createClam();
}


