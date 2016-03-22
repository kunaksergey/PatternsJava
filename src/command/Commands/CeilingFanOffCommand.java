package command.Commands;

import command.Devices.CeilingFan;

/**
 * Created by sa on 21.03.16.
 */
public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
        ceilingFan.printCeilingFan();
    }

    @Override
    public void undo() {
        ceilingFan.high();
        ceilingFan.printCeilingFan();
    }
}
