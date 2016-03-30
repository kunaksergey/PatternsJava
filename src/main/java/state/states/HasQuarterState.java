package state.states;

import state.GumballMachine;

import java.util.Random;

/**
 * Created by sa on 28.03.16.
 */
public class HasQuarterState implements State {
    Random randomWinner=new Random();
    transient GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Вы не можете вставить другую монету");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Монета возвращается");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("Вы дернули за рычаг here");
        int winner=randomWinner.nextInt(10);
        if((winner==0) && (gumballMachine.getCount()>1)){
            gumballMachine.setState(gumballMachine.getWinnerState());
        }else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
     }

    @Override
    public void dispense() {
        System.out.println("Не корректное состояние");
    }
}
