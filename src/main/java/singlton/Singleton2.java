package singlton;

/**
 * Created by superkostya on 21.03.16.
 * Немедленная реализация(если точно знаем, что нам нужен объект)
 */
public class Singleton2 {
    private static Singleton2 singleton2 = new Singleton2();
    ;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return singleton2;
    }
}
