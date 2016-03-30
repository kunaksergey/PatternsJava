package iterator;

import java.util.Iterator;
import java.util.List;

/**
 * Created by superkostya on 23.03.16.
 */
public class PancakeHouseMenu<E> implements Menu {
    List<E> items;
    int position = 0;

    public PancakeHouseMenu(List<E> items) {
           this.items = items;
    }

    public Iterator createIterator() {
        return items.iterator();
    }
}
