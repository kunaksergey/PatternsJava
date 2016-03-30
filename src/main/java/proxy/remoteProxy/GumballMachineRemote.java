package proxy.remoteProxy;

import state.states.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by sa on 29.03.16.
 * Интерфейс для Заместителя. Его реализовывает удаленный класс. Этот объект мы получаем и при
 * получении с удаленной службы
 */
public interface GumballMachineRemote extends Remote {
    final String NAME="GUMMACHINE";
    String getLocation() throws RemoteException;
    int getCount() throws RemoteException;
    State getState() throws RemoteException;
}
