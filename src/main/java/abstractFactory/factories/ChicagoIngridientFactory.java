package abstractFactory.factories;

import abstractFactory.ingridients.absctractIngridients.*;
import abstractFactory.ingridients.specificIngridients.*;
/**
 * Created by sa on 18.03.16.
 */
public class ChicagoIngridientFactory implements IngridientFactory {
    @Override
    public Sauce createSouce() {
        return new ChiliSauce();
    }

    @Override
    public Dough createDough() {
        return new ThickDough();
    }

    @Override
    public Cheese createCheese() {
        return new ParmezanCheese();
    }

    @Override
    public Pepperoni reatePepperoni() {
        return new RedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new OceanClam();
    }
}
