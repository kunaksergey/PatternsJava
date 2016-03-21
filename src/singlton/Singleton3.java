package singlton;

/**
 * Created by superkostya on 21.03.16.
 * Многопоточная реализация-ресурсоемкая;
 */
public class Singleton3 {
    private static Singleton3 singleton3;

    private Singleton3() {
    }

    public static synchronized Singleton3 getInstance() {
        if (singleton3 == null) {
            singleton3 = new Singleton3();
        }
        return singleton3;
    }
}