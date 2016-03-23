package iterator;

/**
 * Created by superkostya on 23.03.16.
 */
public class DinerMenu {
    static final int MAX_ITEM = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public Iteratable createIterator() {
        return new DinerMenuIterator<MenuItem>(menuItems);
    }

}
