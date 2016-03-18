package decorator;

/**
 * Created by sa on 16.03.16.
 */
abstract public class Beverage {
    protected String description;
    protected double cost=0;
    protected EnumSize enumSize;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public EnumSize getSize() {
        return enumSize;
    }

    public void setSize(EnumSize enumSize) {
        this.enumSize = enumSize;
    }
}
