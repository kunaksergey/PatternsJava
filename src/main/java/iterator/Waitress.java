package iterator;

/**
 * Created by superkostya on 23.03.16.
 */
public class Waitress {
    private PancakeHouseMenu pancakeHouseMenu;
    private DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public Waitress() {

    }

    public void setPancakeHouseMenu(PancakeHouseMenu pancakeHouseMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void setDinerMenu(DinerMenu dinerMenu) {
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iteratable<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iteratable<MenuItem> dinerIterator = dinerMenu.createIterator();
        System.out.println("Menu\n-------\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println();
        System.out.println("Menu\n-------\nLUNCH");
        printMenu(dinerIterator);

    }

    private void printMenu(Iteratable<MenuItem> iterator) {
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
