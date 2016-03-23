package iterator;

/**
 * Created by superkostya on 23.03.16.
 */
public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iteratable pancakeIterator = pancakeHouseMenu.createIterator();
        Iteratable dinerIterator = dinerMenu.createIterator();
        System.out.println("Menu\n-------\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("Menu\n-------\nLUNCH");
        printMenu(dinerIterator);

    }

    private void printMenu(Iteratable iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.printf("/s  /f -- /s",
                    menuItem.getName(),
                    menuItem.getPrice(),
                    menuItem.getDescription()
            );
        }
    }
}
