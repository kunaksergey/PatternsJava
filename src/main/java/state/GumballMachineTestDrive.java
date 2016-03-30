package state;

import proxy.remoteProxy.GumballMachineRemote;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by sa on 29.03.16.
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        if(args.length!=2){
            System.out.println("GumballMachine <name> <count>");
            System.exit(1);
        }

        int count=Integer.parseInt(args[1]);
        GumballMachine gumballMachine=new GumballMachine(args[0],count);
        Registry reg = LocateRegistry.createRegistry(1100);
        reg.bind(GumballMachineRemote.NAME,gumballMachine);
        System.out.println("Service GUMball run...");

    }
}
