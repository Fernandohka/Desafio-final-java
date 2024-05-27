package collections.iterators;

import collections.Queue;
import exceptions.Checked;

public class QueueIterator<E> implements Iterator<E> {

    Queue<E> fila;
    int posicao = -1;

    public QueueIterator (Queue<E> fila){
        this.fila = fila;
    }

    @Override
    public E next() {
        if (hasNext())
        {
            posicao++;
            return fila.get(posicao);
        }
        throw new Checked("Não há elementos na posição indicada.");
    }

    @Override
    public boolean hasNext() {
        return (fila.get(posicao + 1) == null)? false : true;
    }
}
