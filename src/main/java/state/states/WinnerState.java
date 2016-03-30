package state.states;

import state.GumballMachine;

/**
 * Created by sa on 28.03.16.
 */
public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Пожалуйста ждите... мы уже выдаем вам шарик");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Извините вы уже дернули рычаг");
    }

    @Override
    public void turnCrank() {
        System.out.println("Дважды джернутый рычаг не дает другого шарика");
    }

    @Override
    public void dispense() {
        System.out.println("Вы ПОБЕДИТЕЛЬ. Вы получаете 2 шарика за 1 монетку");
        if (gumballMachine.getCount()==0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }else{
            gumballMachine.releaseBall();
            if(gumballMachine.getCount()>0){
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }else{
                System.out.println("Упс.. шариков нет");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
