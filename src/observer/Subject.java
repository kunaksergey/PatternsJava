package observer;

/**
 * Created by sa on 16.03.16.
 */
public interface Subject {
    void registerObserver();
    void removeObserver();
    void notifyObserver();
}
