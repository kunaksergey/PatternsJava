package command;

import command.Commands.*;

/**
 * Created by sa on 21.03.16.
 */
public class Main {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl=new SimpleRemoteControl();

        Light light=new Light();
        LightOnCommand lightOnCommand=new LightOnCommand(light);
        LightOffCommand lightOffCommand=new LightOffCommand(light);

        GarageDoor garageDoor=new GarageDoor();
        GarageDownCommand garageDown=new GarageDownCommand(garageDoor);
        GarageUpCommand garageUp=new GarageUpCommand(garageDoor);

        Stereo stereo=new Stereo();
        StereoOnCommand stereoOn=new StereoOnCommand(stereo);
        StereoOffCommand stereoOff=new StereoOffCommand(stereo);

        remoteControl.setSlot(0,garageUp,garageDown);
        remoteControl.onBbuttonWasPressed(0);
        remoteControl.offBbuttonWasPressed(0);

        remoteControl.setSlot(1,lightOnCommand,lightOffCommand);
        remoteControl.onBbuttonWasPressed(0);
        remoteControl.offBbuttonWasPressed(0);

        remoteControl.setSlot(2,stereoOn,stereoOff);
        remoteControl.onBbuttonWasPressed(2);
        remoteControl.offBbuttonWasPressed(2);

        System.out.println(remoteControl);

    }
}
