package abstractFactory.differentPizza;

import abstractFactory.factories.IngridientFactory;

/**
 * Created by sa on 18.03.16.
 */
public class CheesePizza extends Pizza {
    public CheesePizza(IngridientFactory ingridientFactory) {
        super(ingridientFactory);
        name="Пицца с сыром";
    }

    @Override
    public void prepare() {
       cheese=ingridientFactory.createCheese();
       dough=ingridientFactory.createDough();
       pepperoni=ingridientFactory.reatePepperoni();
       sauce=ingridientFactory.createSouce();
       clam=ingridientFactory.createClam();
    }
}
