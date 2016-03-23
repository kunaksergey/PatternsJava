package strategy;
/**
 * Created by sa on 15.03.16.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Стратегия");
        System.out.println("-------------------------------");
        Character character=new King();
        character.fight();
        character.setBehavior(new BowAndArrowBehavior());
        character.fight();
        System.out.println("-------------||---------------");
    }
}
