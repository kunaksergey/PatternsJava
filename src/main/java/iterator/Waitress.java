package iterator;

import java.util.Iterator;

/**
 * Created by superkostya on 23.03.16.
 */
public class Waitress {
    private Menu pancakeHouseMenu;
    private Menu dinerMenu;
    private Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu,Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu=cafeMenu;

    }

    public Waitress() {

    }

    public void setPancakeHouseMenu(Menu pancakeHouseMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void setDinerMenu(Menu dinerMenu) {
        this.dinerMenu = dinerMenu;
    }

    public void setCafeMenu(Menu cafeMenu) {
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
        System.out.println("Menu\n-------\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println();
        System.out.println("Menu\n-------\nLUNCH");
        printMenu(dinerIterator);
        System.out.println("Menu\n-------\nCafe");
        printMenu(cafeIterator);

    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.printf("%s  %f -- %s\n",
                    menuItem.getName(),
                    menuItem.getPrice(),
                    menuItem.getDescription()
            );
        }
    }
}
