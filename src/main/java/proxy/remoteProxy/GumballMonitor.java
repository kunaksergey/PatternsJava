package proxy.remoteProxy;

import java.rmi.RemoteException;

/**
 * Created by sa on 29.03.16.
 */
public class GumballMonitor {
    GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void print() {
        try {
            System.out.println("GumMachine location:"+ machine.getLocation()+"...");
            System.out.println("GumMachine count:"+ machine.getCount()+"...");
            System.out.println("GumMachine state:"+ machine.getState()+"...");
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}


