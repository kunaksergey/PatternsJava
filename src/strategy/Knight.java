package strategy;

/**
 * Created by sa on 15.03.16.
 */
public class Knight extends Character {
   public Knight() {
        super(new SwordBehavior());
    }
}
