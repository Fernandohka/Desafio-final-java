package collections;

import collections.iterators.Iterable;
import collections.iterators.Iterator;
import collections.iterators.LinkedListIterator;
import collections.iterators.Stream;

public class LinkedList<T> extends List<T> implements Iterable<T>
{
    private Node<T> head = null;
    private Node<T> tail = null;

    //pegar as informações do contato pelo índice
    @Override
    public T get(int index)
    {
        Node<T> atual = head;
        if(index >= size) {
            return null;
        } 
        while(index > 0) {
            atual = atual.getNext();
            index--;
        }

        return atual.getValue();
    }

    @Override
    public void set(int index, T value) { }
    

    @Override
    public void add(T value) {
        size++;  //tamanho da lista aumenta em 1
        Node<T> node = new Node<T>(value);

        if(head == null) 
        {
            head = node;
            tail = node;
            return;
        }

        node.setPrev(tail); 
        tail.setNext(node);
        tail = node;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator<>(this);
    }

    @Override
    public Stream<T> stream() {
        return new Stream<>(this);
    }
}
