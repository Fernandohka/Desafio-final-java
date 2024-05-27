package collections;

import collections.iterators.Iterable;
import collections.iterators.Iterator;
import collections.iterators.QueueIterator;
import collections.iterators.Stream;

public class Queue<T> implements Iterable<T>
{
    
    private Integer size = 0;
    private Node<T> tail = null;
    private Node<T> head = null;

    //quando o construtor for vazio, ou seja, as variáveis tiverem o valor padrão(0, null), não é preciso fazer o construtor

    void enqueue(T value) {
        size++;

        Node<T> node = new Node<T>(value);

        if(head == null) {
            head = node; //primeiro valor
            tail = node; // último valor
            return;
        }

        tail.setNext(node); //tail faz referência ao último valor adicionado na lista (node)
        node.setPrev(tail); //node faz referência ao valor adicionado antes do dele mesmo (tail)
        tail = node; //tail recebe node porque agora node é o último valor da lista
    }

    T dequeue() {
        head = head.getNext();
        size--;

        return head.getValue();
    }

    
    T peek() {
        return head.getValue();
    }

    public T get(int index)
    {
        Node<T> atual = head;
        if(index > size) {
            return null;
        } 
        while(index > 0) {
            atual = atual.getNext();
            index--;
        }

        return atual.getValue();
    }


     @Override
    public Iterator<T> iterator() {
        return new QueueIterator<>(this);
    }


    @Override
    public Stream<T> stream() {
        return new Stream<>(this);
    }

}
