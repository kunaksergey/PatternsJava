package state.states;

import java.io.Serializable;

/**
 * Created by sa on 28.03.16.
 */
public interface State extends Serializable{
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
