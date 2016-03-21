package command.Devices;

/**
 * Created by sa on 21.03.16.
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int OFF = 0;
    private String location;
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        this.speed = OFF;
    }

    public void high() {
        if(getSpeed()<HIGH)
            speedUp();
    }

    public void low() {
        if(getSpeed()>1)
            speedDown();
    }

    public void off() {
        speed = OFF;
    }

    public int getSpeed() {
        return speed;
    }
    private void speedUp(){
        speed++;
    }
    private void speedDown(){
        speed--;
    }
    public void printCeilingFan(){
        System.out.println("Cкорость вращения:"+getSpeed());
    }
}
