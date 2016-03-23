package adapter;

/**
 * Created by superkostya on 22.03.16.
 */
public class Turkey implements Turkeyable {
    @Override
    public void blabla() {
        System.out.println("Bla Bla Bla");
    }

    @Override
    public void fly() {
        System.out.println("Индюк полетел");
    }
}
