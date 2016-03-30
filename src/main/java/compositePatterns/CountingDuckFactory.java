package compositePatterns;

/**
 * Created by sa on 30.03.16.
 */
public class CountingDuckFactory extends AbstrackDuckFactory {
    @Override
    public Quackable createMallardDuck() {

        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
         return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
         return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
         return new QuackCounter(new RedheadDuck());
    }
}
