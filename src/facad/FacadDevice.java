package facad;

import facad.device.CD;
import facad.device.Light;
import facad.device.MovieDevice;
import facad.device.PopkornDevice;

/**
 * Created by sa on 22.03.16.
 */
public class FacadDevice {
    private final PopkornDevice popkornDevice;
    private final CD cd;
    private final Light light;
    private final MovieDevice movieDevice;

    public FacadDevice(PopkornDevice popkornDevice, CD cd, Light light, MovieDevice movieDevice) {

        this.popkornDevice = popkornDevice;
        this.cd = cd;
        this.light = light;
        this.movieDevice = movieDevice;
    }

    public void start() {
        popkornDevice.on();
        popkornDevice.hot();
        cd.insertDisk();
        light.off();
        movieDevice.start();
    }

    public void stop() {
        movieDevice.stop();
        light.on();
        cd.eject();
        popkornDevice.off();
    }

}
