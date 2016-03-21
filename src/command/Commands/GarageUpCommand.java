package command.Commands;

import command.GarageDoor;

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
}
