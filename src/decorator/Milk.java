package decorator;

/**
 * Created by sa on 16.03.16.
 */
public class Milk extends CondimentDecorator{

    public Milk(Beverage beverage) {
        super(beverage);
        description="Milk";
    }
}
