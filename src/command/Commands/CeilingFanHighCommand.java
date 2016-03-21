package command.Commands;

import command.Devices.CeilingFan;

/**
 * Created by sa on 21.03.16.
 */
public class CeilingFanHighCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.high();
        ceilingFan.printCeilingFan();
    }

    @Override
    public void undo() {
        ceilingFan.low();
        ceilingFan.printCeilingFan();
    }
}
