package compositePatterns;

/**
 * Created by sa on 30.03.16.
 */
public class DuckSimulate {
    public static void main(String[] args) {
        DuckSimulate duckSimulate=new DuckSimulate();
        AbstrackDuckFactory factory=new CountingDuckFactory();
        duckSimulate.simulate(factory);
    }
    void simulate(AbstrackDuckFactory factory){
        Quackable mallerDuck=factory.createMallardDuck();
        Quackable redheadDuck=factory.createRedheadDuck();
        Quackable rubberDuck=factory.createRubberDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable goose=new GooseAdapter(new Goose());

        Flock flockOfDucks=new Flock();
        flockOfDucks.add(mallerDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        Flock flockOfMallards=new Flock();
        flockOfMallards.add(factory.createMallardDuck());
        flockOfMallards.add(factory.createMallardDuck());
        flockOfMallards.add(factory.createMallardDuck());
        flockOfMallards.add(factory.createMallardDuck());
        flockOfDucks.add(flockOfMallards);
        System.out.println("Duck simulator");
        System.out.println("Whole Floack simulate");
        simulate(flockOfDucks);
        System.out.println();
        System.out.println("MallardDuck simulate");
        simulate(flockOfMallards);
        System.out.println("The ducks quacked "+QuackCounter.getNumberOfQuacks());
        simulate(goose);
    }
    void simulate(Quackable duck){
        duck.quack();
    }

}
