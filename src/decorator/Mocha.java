package decorator;

/**
 * Created by sa on 16.03.16.
 */
public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage) {
        super(beverage);
        description="Mocha";
    }
}
