package compositor;

import iterator.*;

/**
 * Created by superkostya on 24.03.16.
 */
public class MenuTest {
    public static void main(String[] args) {
        MenuComponent pancakeMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenu = new Menu("ALL MENUS", "All menus combine");
        allMenu.add(pancakeMenu);
        allMenu.add(dinerMenu);
        allMenu.add(cafeMenu);

        dinerMenu.add(new MenuItem(
                "Pasta",
                "Spagetti with Sauce",
                true,
                3.89
        ));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem(
                "Apple pie",
                "Apple pie with a flakey",
                true,
                1.59
        ));

        Waitress waitress = new Waitress(allMenu);
        waitress.print();
    }
}
