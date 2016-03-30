package iterator;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by sa on 24.03.16.
 */
public class CafeMenu<E> implements Menu {
    HashMap<String,E> hashMapCafe;

    public CafeMenu(HashMap<String, E> hashMapCafe) {
        this.hashMapCafe = hashMapCafe;
    }

    @Override
    public Iterator createIterator() {
        return hashMapCafe.values().iterator();
    }
}
