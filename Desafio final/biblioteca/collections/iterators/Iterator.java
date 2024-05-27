package collections.iterators;

public interface Iterator<E> {

    public int posicao = -1;

    E next();
    boolean hasNext();
    
}