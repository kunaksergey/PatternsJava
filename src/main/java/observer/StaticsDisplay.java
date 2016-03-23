package observer;

/**
 * Created by sa on 16.03.16.
 */
public class StaticsDisplay implements Observer,Display {
    double humidity;
    @Override
    public void display() {
        System.out.println("Влажность:"+humidity);
    }

    @Override
    public void update(DataObserv data) {
        humidity=data.getHumidity();
        display();
    }
}
