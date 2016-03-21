package command.Commands;

import command.Light;

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
}
