package iterator;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sa on 23.03.16.
 */
public class WaitressTest {
    Waitress waitress;
    @Before
   public void start(){
        List<MenuItem> listItems=new ArrayList<MenuItem>();
        listItems.add(new MenuItem("Чай", "Зеленый", 2f));
        listItems.add(new MenuItem("Блинчики", "с творогом", 5f));
        listItems.add(new MenuItem("Блинчики", "с мясом", 6f));
        listItems.add(new MenuItem("Компот", "с сухофруктми", 2f));
        listItems.add(new MenuItem("Кофе", "Jacobs", 3f));
        listItems.add(new MenuItem("Курасан", "со сгущенкой", 1.5f));



        MenuItem[] arrayItems= {
                new MenuItem("Борщ", "Украинский", 12f),
                new MenuItem("Пампушки", "с часноком", 3f),
                new MenuItem("Компот", "с черносливом", 4f),
                new MenuItem("Пюре", "постное", 4f),
                new MenuItem("Отбивная", "куриная", 4f)
        };
        HashMap<String,MenuItem> hashMapItem=new HashMap<>();
        hashMapItem.put( "Burger",new MenuItem("Бургер", "с мясом",0.5f));
        hashMapItem.put("Coffee",new MenuItem("Кофе", "с булочкой",1.0f));

        waitress = new Waitress(
                new PancakeHouseMenu<MenuItem>(listItems),
                new DinerMenu<MenuItem>(arrayItems),
                new CafeMenu<MenuItem>(hashMapItem)
                );
    }

    @Test
   public void test1(){


        waitress.printMenu();
    }
}