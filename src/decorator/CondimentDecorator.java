package decorator;

/**
 * Created by sa on 16.03.16.
 */
abstract public class CondimentDecorator extends Beverage{
    Beverage beverage;

    CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return super.getCost()+beverage.getCost();
    }

    @Override
    public String getDescription() {
        return super.getDescription()+":"+beverage.getDescription();
    }
}
