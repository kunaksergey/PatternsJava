package state;

import java.rmi.RemoteException;

/**
 * Created by sa on 28.03.16.
 * Патерн состояние управляет изменением поведения объекта при изменении его
 * внутреннего состояния. Внешне это выглядит так, словно объект меняет свой класс
 * Может рассамтриваться как замена многочисленных условных конструкций в коде контекста.
 * Если поведение инкапсулиированно в обїектах состояния, то достачтоно вібрать другой объект состояния
 */
public class Main {
    public static void main(String[] args) {

        GumballMachine gumballMachine= null;
        try {
            gumballMachine = new GumballMachine("Nevada",10);
        } catch (RemoteException e) {

        }
        System.out.println("----------------------------");
        for (int i=0;i<10;i++) {
            System.out.println("------------------");
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
            System.out.println("------------------");
        }


    }
}
