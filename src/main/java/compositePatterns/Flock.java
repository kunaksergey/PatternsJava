package compositePatterns;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sa on 30.03.16.
 */
public class Flock implements Quackable {
    List<Quackable> quackers=new ArrayList<>();
    public void add(Quackable qucker){
        quackers.add(qucker);
    }
    @Override
    public void quack() {
        for (Quackable quacker:quackers){
            quacker.quack();
        }
    }
}
