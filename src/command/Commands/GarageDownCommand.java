package command.Commands;

import command.GarageDoor;

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
}
