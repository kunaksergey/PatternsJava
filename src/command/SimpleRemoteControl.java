package command;

import command.Commands.Command;
import command.Commands.NoCommand;

/**
 * Created by sa on 21.03.16.
 */
public class SimpleRemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public SimpleRemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];
        Command noCommand=new NoCommand();
        for (int i=0;i<7;i++){
            onCommands[i]=noCommand;
            offCommands[i]=noCommand;
        }
    }

    Command slot;

    public void setSlot(int slot, Command onCommand,Command offCommand) {
        onCommands[slot]=onCommand;
        offCommands[slot]=offCommand;
    }

    public void onBbuttonWasPressed(int slot){
        onCommands[slot].execute();
    }

    public void offBbuttonWasPressed(int slot){
        offCommands[slot].execute();
    }

    public String toString(){
        StringBuilder str=new StringBuilder();
        str.append("\n------------Remote Control---------\n");
        for(int i=0;i<onCommands.length;i++){
            str.append("[slot "+i +"]:"+onCommands[i].getClass().getName()+ "  "+
            offCommands[i].getClass().getName()+"\n");
        }
        return str.toString();
    }
}
