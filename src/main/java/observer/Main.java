package observer;

/**
 * Created by sa on 16.03.16.
 */
public class Main {
    public static void main(String[] args) {
        Main main=new Main();
        main.test();


    }

    void test(){
        WeatherObserver weatherObserver=new WeatherObserver();
        weatherObserver.addObserver(new ForecatDisplay());
        weatherObserver.addObserver(new StaticsDisplay());
        weatherObserver.addObserver(new CurentConditionsDisplay());

        weatherObserver.setMeasurements (80, 65, 30.4f);
        weatherObserver.setMeasurements (82, 70, 29.2f);
        weatherObserver.setMeasurements (78, 90, 29.2f);

    }


}
