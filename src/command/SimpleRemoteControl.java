package command;

import command.Commands.Command;
import command.Commands.NoCommand;

/**
 * Created by sa on 21.03.16.
 */
public class SimpleRemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public SimpleRemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];
        Command noCommand=new NoCommand();
        for (int i=0;i<7;i++){
            onCommands[i]=noCommand;
            offCommands[i]=noCommand;
        }
        undoCommand=noCommand;
    }

    Command slot;

    public void setSlot(int slot, Command onCommand,Command offCommand) {
        onCommands[slot]=onCommand;
        offCommands[slot]=offCommand;
    }

    public void onButtonWasPressed(int slot){
        onCommands[slot].execute();
        undoCommand=onCommands[slot];
    }

    public void offButtonWasPressed(int slot)
    {
        offCommands[slot].execute();
        undoCommand=offCommands[slot];
    }

    public void undoButtonWasPressed(){
        undoCommand.undo();
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
