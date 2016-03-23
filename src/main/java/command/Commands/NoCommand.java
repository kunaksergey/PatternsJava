package command.Commands;

/**
 * Created by sa on 21.03.16.
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("no command");
    }

    @Override
    public void undo() {
        System.out.println("no command");
    }
}
