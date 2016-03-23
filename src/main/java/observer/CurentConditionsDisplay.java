package observer;

/**
 * Created by sa on 16.03.16.
 */
public class CurentConditionsDisplay implements Observer,Display{
    double temperature;
    @Override
    public void update(DataObserv data) {
        temperature=data.getTemperature();
        display();
    }

    @Override
    public void display() {
        System.out.println("Температура:"+temperature);
    }
}
