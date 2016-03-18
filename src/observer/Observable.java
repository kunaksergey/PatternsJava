package observer;

/**
 * Created by sa on 16.03.16.
 */
public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
