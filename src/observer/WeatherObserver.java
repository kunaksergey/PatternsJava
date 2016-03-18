package observer;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sa on 16.03.16.
 */
public class WeatherObserver implements Observable {
    private Set<Observer> setObservers=new HashSet<>();
    private DataObserv data;

    public WeatherObserver() {
        this.data = new DataObserv();
    }

    @Override
    public void addObserver(Observer observer) {
            setObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(setObservers.contains(observer))
            setObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer:setObservers) {
            observer.update(data);
        }
    }

    public DataObserv getData() {
        return data;
    }

    public void setMeasurements(double temperature,double humidity,double pressure){
        data.setTemperature(temperature);
        data.setHumidity(humidity);
        data.setPressure(pressure);
        notifyObservers();
    }


}
