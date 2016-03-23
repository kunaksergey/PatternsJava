package strategy;

/**
 * Created by sa on 15.03.16.
 */
public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Лук и стрелы");
    }
}
