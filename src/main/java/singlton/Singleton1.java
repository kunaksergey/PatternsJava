package singlton;

/**
 * Created by superkostya on 21.03.16.
 * Классическая реализация в одном потоке
 */
public class Singleton1 {
    private static Singleton1 singleton1;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (singleton1 == null) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}
