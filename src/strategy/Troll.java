package strategy;

/**
 * Created by sa on 15.03.16.
 */
public class Troll extends Character {
    public Troll() {
        super(new AxeBehavior());
    }
}
