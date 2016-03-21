package command.Commands;

import command.Devices.GarageDoor;

/**
 * Created by sa on 21.03.16.
 */
public class GarageDownCommand implements Command{
    GarageDoor garageDoor;

    public GarageDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
