package iterator;

import java.util.List;

/**
 * Created by superkostya on 23.03.16.
 */
public class PancakeIterator<E> implements Iteratable {
    List<E> items;
    int position = 0;

    public PancakeIterator(List<E> list) {
        this.items = list;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public E next() {
        E menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }
}



