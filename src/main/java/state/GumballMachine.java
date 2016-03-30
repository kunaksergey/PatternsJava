package state;

import state.states.*;
import proxy.remoteProxy.GumballMachineRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by sa on 28.03.16.
 * Класс автомата
 */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote{
    State noQuarterState; //состояние-нет монетки
    State hasQuarterState;//состояние-есть монетка
    State soldOutState;//состояние-все шарики проданы
    State soldState; //состояние-продажа шарика
    State state = soldOutState; //cостояние по умолчанию
    State winnerState;
    String location;
    int count = 0; //кол-во шариков в автомате

    public GumballMachine(String location,int count) throws RemoteException{
        this.count = count;
        this.location=location;
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        winnerState=new WinnerState(this);
        if (count > 0) {
            state = noQuarterState;
        }
    }

    /**
     * Заправка автомата
     * @param count
     */
    public void refill(int count){
        this.count=count;
        state=noQuarterState;
    }

    /**
     * Втавить монетку
     */
    public void insertQuarter() {
        state.insertQuarter();
    }

    /**
     * Забрать монетку
     */
    public void ejectQuarter() {
        state.ejectQuarter();
    }

    /**
     * Дернуть за рычаг
     */
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    /**
     * Отправить шарик покупателю
     */
    public void releaseBall() {
        System.out.println("Шарик отправляется вкорзину");
        if (count != 0) {
            count = count - 1;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public int getCount() {
        return count;
    }

    public State getWinnerState() {
        return winnerState;
    }

    @Override
    public String getLocation() {
        return location;
    }
}
