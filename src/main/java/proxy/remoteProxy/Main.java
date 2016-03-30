package proxy.remoteProxy;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by sa on 29.03.16.
 * Петтерн удаленный заместитель предоставляет суррогатный объект, управляющий доступом к другому объекту
 */
public class Main {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry reg = LocateRegistry.getRegistry("localhost",1100);
        GumballMachineRemote service = (GumballMachineRemote) reg.lookup(GumballMachineRemote.NAME);
        GumballMonitor monitor=new GumballMonitor(service);
        monitor.print();
    }
}




