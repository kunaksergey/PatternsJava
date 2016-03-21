package command.Commands;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sa on 21.03.16.
 */
public class MacroOnCommand implements Command {
    List<Command> commands;

    public MacroOnCommand() {
        commands=new ArrayList<>();
    }
    public MacroOnCommand(List<Command> commands) {
        this();
        this.commands.addAll(commands)  ;
    }
    public MacroOnCommand(Command commands) {
        this();
        this.commands.add(commands)  ;
    }

    @Override
    public void execute() {
        for (Command command:commands) {
            command.execute();
        }

    }

    @Override
    public void undo() {
        for (Command command:commands) {
            command.undo();
        }
    }

    public void setCommand(Command command){
        commands.add(command);
    }

    public void setCommand(List<Command> commands) {
        this.commands.addAll(commands)  ;
    }
}
