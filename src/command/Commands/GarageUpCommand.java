package command.Commands;

import command.Devices.GarageDoor;

/**
 * Created by sa on 21.03.16.
 */
public class GarageUpCommand implements Command{
    GarageDoor garageDoor;

    public GarageUpCommand(GarageDoor garageDoor)
    {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute()
    {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
