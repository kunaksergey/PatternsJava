package observer;

/**
 * Created by sa on 16.03.16.
 */
public class DataObserv {
    private double temperature; //температура
    private double humidity;   //влажность
    private double pressure;   //давление

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
}

