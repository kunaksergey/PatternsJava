package decorator;

/**
 * Created by sa on 16.03.16.
 */
public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage) {
        super(beverage);
        description="Whip";
    }
}
