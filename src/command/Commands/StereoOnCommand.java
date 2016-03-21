package command.Commands;

import command.Stereo;

/**
 * Created by sa on 21.03.16.
 */
public class StereoOnCommand implements Command{
    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(12);
    }
}
