package iterator;

/**
 * Created by superkostya on 23.03.16.
 */
public class DinerMenu<E> {
    static final int MAX_ITEM = 6;
    int numberOfItems = 0;
    E[] menuItems;

    public DinerMenu(E[] menuItems) {
        this.menuItems = menuItems;
    }

    public Iteratable createIterator() {
        return new DinerMenuIterator<E>(menuItems);
    }

}
