package compositor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by superkostya on 24.03.16.
 */
public class Menu extends MenuComponent {
    List<MenuComponent> list = new ArrayList<>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        list.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        list.remove(menuComponent);
    }

    @Override
    public MenuComponent getChield(int i) {
        return list.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println("\n" + getName());
        System.out.println(",  " + getDescription());
        System.out.println("-------------------");
        Iterator<MenuComponent> iterator = list.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }
}
