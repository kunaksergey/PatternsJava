package state.states;

import state.GumballMachine;

/**
 * Created by sa on 28.03.16.
 */
public class NoQuarterState implements State {
    transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Вы вставили монетку");
        gumballMachine.setState(gumballMachine.getHasQuarterState());

    }

    @Override
    public void ejectQuarter() {
        System.out.println("Вы не вcтавили монетку");
    }

    @Override
    public void turnCrank() {
        System.out.println("Вы дернули за рычаг, но монетки там нет");
    }

    @Override
    public void dispense() {
        System.out.println("Вы должны сперва заплатить");
    }
}
