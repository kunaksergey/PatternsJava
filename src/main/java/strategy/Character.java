package strategy;

/**
 * Created by sa on 15.03.16.
 */
abstract public class Character {
    WeaponBehavior behavior;
     Character(WeaponBehavior behavior){
         this.behavior=behavior;
     }
    public void fight(){
        behavior.useWeapon();
    }

    public void setBehavior(WeaponBehavior behavior) {
        this.behavior = behavior;
    }
}
