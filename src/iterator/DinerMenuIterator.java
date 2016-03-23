package iterator;

/**
 * Created by superkostya on 23.03.16.
 */
public class DinerMenuIterator<E> implements Iteratable {
    E[] items;
    int position = 0;

    public DinerMenuIterator(E[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public E next() {
        E menuItem = items[position];
        position = position + 1;
        return menuItem;
    }
}
