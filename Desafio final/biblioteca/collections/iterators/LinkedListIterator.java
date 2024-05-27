package collections.iterators;

import collections.LinkedList;
import exceptions.Checked;

public class LinkedListIterator<E> implements Iterator<E> {

    int posicao = -1;
    LinkedList<E> lista;

    public LinkedListIterator (LinkedList<E> lista) {
        this.lista = lista;
    }   

    @Override
    public E next() throws Checked{
        if (hasNext())
        {
            posicao++;
            return lista.get(posicao);
        }
        throw new Checked("Não há elementos na posição indicada.");
    }

    @Override
    public boolean hasNext() {
        return (lista.get(posicao + 1) == null)? false : true;
    }
    
}
