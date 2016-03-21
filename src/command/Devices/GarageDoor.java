package command.Devices;

/**
 * Created by sa on 21.03.16.
 */
public class GarageDoor {
    public void up(){
        System.out.println("Ворота поднять");
    }

    public void down(){
        System.out.println("Ворота опустить");
    }

    public void stop(){
        System.out.println("Ворота остановлены");
    }

    public void lightOn(){
        System.out.println("Свет в гараже включен");
    }

    public void lightOff(){
        System.out.println("Свет в гараже выключен");
    }
}
