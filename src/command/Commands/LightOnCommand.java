package command.Commands;

import command.Devices.Light;

/**
 * Created by sa on 21.03.16.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
            light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
