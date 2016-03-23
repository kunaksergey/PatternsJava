package patternMethod;

/**
 * Created by sa on 22.03.16.
 */
abstract public class CaffeineBeverage {
   final void prepareRecipe(){
        boilWater();
        brew();
        pourInCap();
        if (getAnswer()) {
           addCondiments();
       }
    }

    boolean getAnswer() {
        return true;
    }

    ;
    void boilWater(){
        System.out.println("Кипятим воду");
    }
    void pourInCap(){
        System.out.println("Наливаем в чашку");
    }

    abstract void brew();
    abstract void addCondiments();
}
