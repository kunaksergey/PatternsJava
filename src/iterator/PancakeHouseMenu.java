package iterator;

/**
 * Created by superkostya on 23.03.16.
 */
public class PancakeHouseMenu {
    E[] items;
    int position = 0;

    public DinerMenuIterator(E[] items) {
        this.items = items;
    }
    public Iteratable createIterator() {
        return new PancakeIterator<MenuItem>();
    }
}
