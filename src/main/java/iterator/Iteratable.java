package iterator;

/**
 * Created by superkostya on 23.03.16.
 */
public interface Iteratable<E> {
    boolean hasNext();

    E next();
}
