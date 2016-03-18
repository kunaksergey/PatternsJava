package abstractFactory.factories;

import abstractFactory.ingridients.absctractIngridients.*;
import abstractFactory.ingridients.specificIngridients.*;

/**
 * Created by sa on 18.03.16.
 */
public class NYIngridientFactory implements IngridientFactory {

    @Override
    public Sauce createSouce() {
        return new TomatoSauce();
    }

    @Override
    public Dough createDough() {
        return new ThinDough();
    }

    @Override
    public Cheese createCheese() {
        return new MozarelaCheese();
    }

    @Override
    public Pepperoni reatePepperoni() {
        return new SpacyPepperoni();
    }

    @Override
    public Clam createClam() {
        return new SeeClam();
    }
}
