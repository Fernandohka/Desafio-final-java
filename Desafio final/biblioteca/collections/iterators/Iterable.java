package collections.iterators;

public interface Iterable<E> {
    
    Iterator<E> iterator();
    Stream<E> stream();
}
