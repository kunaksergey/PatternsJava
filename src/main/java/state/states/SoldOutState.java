package state.states;

import state.GumballMachine;

/**
 * Created by sa on 28.03.16.
 */
public class SoldOutState implements State {
    transient GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Извините шариков нет");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Извините монеты нет");
    }

    @Override
    public void turnCrank() {
        System.out.println("Извините монеты нет");
    }

    @Override
    public void dispense() {

    }
}
