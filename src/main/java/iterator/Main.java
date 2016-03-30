package iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by superkostya on 23.03.16.
 */
public class Main {
    public static void main(String[] args) {
        Waitress waitress;

        Main main = new Main();
       for (int i=0;i<6;i++){
           System.out.println(i);
       }
        waitress = new Waitress(
                        new PancakeHouseMenu<MenuItem>(main.getListItems()),
                        new DinerMenu<MenuItem>(main.getArrayItems()),
                        new CafeMenu<MenuItem>(main.getHashMapItem()));
        waitress.printMenu();
    }

    List<MenuItem> getListItems() {
        List<MenuItem> list = new ArrayList<MenuItem>();
        list.add(new MenuItem("Чай", "Зеленый", 2f));
        list.add(new MenuItem("Блинчики", "с творогом", 5f));
        list.add(new MenuItem("Блинчики", "с мясом", 6f));
        list.add(new MenuItem("Компот", "с сухофруктми", 2f));
        list.add(new MenuItem("Кофе", "Jacobs", 3f));
        list.add(new MenuItem("Курасан", "со сгущенкой", 1.5f));
        return list;
    }

    MenuItem[] getArrayItems() {
        MenuItem[] menuItems = new MenuItem[5];
        menuItems[0] = new MenuItem("Борщ", "Украинский", 12f);
        menuItems[1] = new MenuItem("Пампушки", "с часноком", 3f);
        menuItems[2] = new MenuItem("Компот", "с черносливом", 4f);
        menuItems[3] = new MenuItem("Пюре", "постное", 4f);
        menuItems[4] = new MenuItem("Отбивная", "куриная", 4f);
        return menuItems;
    }

    public HashMap<String,MenuItem> getHashMapItem() {
        HashMap<String,MenuItem> hashMapItem=new HashMap<>();
        hashMapItem.put("Burger",new MenuItem("Бургер", "с мясом",0.5f));
        hashMapItem.put("Coffee",new MenuItem("Кофе", "с булочкой",1.0f));
        return hashMapItem;
    }
}
