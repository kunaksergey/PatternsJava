package decorator;

import static decorator.EnumSize.*;

/**
 * Created by sa on 16.03.16.
 */
public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        super(beverage);
        description="Soy";
    }

    @Override
    public double getCost(){
        double cst=0;
        switch (getSize()){
            case BIG : cst=20;break;
            case MIDDLE : cst=15;break;
            case SMALL : cst=10;break;
            default:cst=20;
        }
        return cst+beverage.getCost();
    }
}
