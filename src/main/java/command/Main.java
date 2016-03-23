package command;

import command.Commands.*;
import command.Devices.CeilingFan;
import command.Devices.GarageDoor;
import command.Devices.Light;
import command.Devices.Stereo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sa on 21.03.16.
 * Смысл патерна Команда-это инкапсуляция вызовов в один метод, объявленный в интерфейсе Сommand.
 * Вызывающий объект не знает, что находится в команде, он только знает,что последний обладает метод
 * execute, который собственно и вызывает
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

        CeilingFan ceilingFan=new CeilingFan("Вентелятов комнате");
        CeilingFanHighCommand ceilingFanHigh=new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff=new CeilingFanOffCommand(ceilingFan);

        remoteControl.setSlot(0,garageUp,garageDown);
        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);

        remoteControl.setSlot(1,lightOnCommand,lightOffCommand);
        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);

        remoteControl.setSlot(2,stereoOn,stereoOff);
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);
        System.out.println();

        remoteControl.undoButtonWasPressed();

        remoteControl.setSlot(6,ceilingFanHigh,ceilingFanOff);
        remoteControl.onButtonWasPressed(6);
        remoteControl.onButtonWasPressed(6);
        remoteControl.onButtonWasPressed(6);
        remoteControl.onButtonWasPressed(6);
        remoteControl.onButtonWasPressed(6);

        MacroOnCommand macroOnCommand=new MacroOnCommand();
        List<Command> listCommandsOn=new ArrayList<>();
        listCommandsOn.add(lightOnCommand);
        listCommandsOn.add(ceilingFanHigh);
        listCommandsOn.add(garageUp);
        listCommandsOn.add(stereoOn);
        macroOnCommand.setCommand(listCommandsOn);


        MacroOffCommand macroOffCommand=new MacroOffCommand();
        List<Command> listCommandsOff=new ArrayList<>();
        listCommandsOff.add(lightOffCommand);
        listCommandsOff.add(ceilingFanOff);
        listCommandsOff.add(garageDown);
        listCommandsOff.add(stereoOff);
        macroOffCommand.setCommand(listCommandsOff);

        remoteControl.setSlot(6,macroOnCommand,macroOffCommand);
        System.out.println("--------------------------");
        remoteControl.onButtonWasPressed(6);
        System.out.println("--------------------------");
        remoteControl.undoButtonWasPressed();
        //remoteControl.offButtonWasPressed(6);
        System.out.println("--------------------------");
        remoteControl.offButtonWasPressed(6);
        System.out.println("--------------------------");
        System.out.println(remoteControl);

    }
}
