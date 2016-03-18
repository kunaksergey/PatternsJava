package observer;

/**
 * Created by sa on 16.03.16.
 */
public class ForecatDisplay  implements Observer,Display{
    double pressure;
    @Override
    public void display() {
        System.out.println("Давление:"+pressure);
    }

    @Override
    public void update(DataObserv data) {
        pressure=data.getPressure();
        display();

    }
}
