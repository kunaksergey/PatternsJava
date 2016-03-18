package decorator;

/**
 * Created by sa on 16.03.16.
 */
public class Main {
    public static void main(String[] args) {
        Espresso espresso=new Espresso();
        espresso.setCost(10);

        Milk milk=new Milk(espresso);


        milk.setCost(20);
        Whip whip=new Whip(milk);
        whip.setCost(10);
        Beverage beverage=new Soy(whip);
        beverage.setSize(EnumSize.SMALL);
        beverage.setCost(20);

        System.out.println(beverage.getDescription()+" $"+beverage.getCost());
    }

}
