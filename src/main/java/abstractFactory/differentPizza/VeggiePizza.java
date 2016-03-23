package abstractFactory.differentPizza;

import abstractFactory.factories.IngridientFactory;

/**
 * Created by sa on 18.03.16.
 */
public class VeggiePizza extends Pizza{
    public VeggiePizza(IngridientFactory ingridientFactory) {
        super(ingridientFactory);
        name="Вегетарианская пицца";
    }

    @Override
    public void prepare() {
        cheese=ingridientFactory.createCheese();
        clam=ingridientFactory.createClam();
        sauce=ingridientFactory.createSouce();
        dough=ingridientFactory.createDough();
        pepperoni=ingridientFactory.reatePepperoni();
    }
}
