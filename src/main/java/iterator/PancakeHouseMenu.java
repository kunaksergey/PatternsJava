package iterator;

import java.util.List;

/**
 * Created by superkostya on 23.03.16.
 */
public class PancakeHouseMenu<E> {
    List<E> items;
    int position = 0;

    public PancakeHouseMenu(List<E> items) {
        this.items = items;
    }
    public Iteratable createIterator() {
        return new PancakeIterator<E>(items);
    }
}
