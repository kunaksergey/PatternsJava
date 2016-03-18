package strategy;

/**
 * Created by sa on 15.03.16.
 */
public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Удар мечем");
    }
}
