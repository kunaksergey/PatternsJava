package adapter;

/**
 * Created by superkostya on 22.03.16.
 */
public class Duck implements Duckable {
    @Override
    public void quack() {
        System.out.println("Га га га");
    }

    @Override
    public void fly() {
        System.out.println("Пролетели 10 метров");
    }
}
