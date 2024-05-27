package collections;

import collections.iterators.Iterable;
import collections.iterators.Iterator;
import collections.iterators.StackIterator;
import collections.iterators.Stream;

public class Stack<T> extends Size implements Iterable<T>
{

    @Override
    protected void setSize(Integer size) {
        
    }

    private T[] data;
    private Integer size = 0;
    private T tail;

    Stack() {
        data = (T[])(new Object[10]);
    }

    Stack(int capacity) {
        data = (T[])(new Object[capacity]);
    }

    void push(T value)
    {
        if (size == data.length) {
            T[] copy = (T[])(new Object[2 * data.length]);
            
            for(int i = 0; i < size; i++) {
                copy[i] = data[i];
            }

            data = copy;
        }

        data[size] = value;
        size++;
    }

    T pop() {
        tail = data[size-1];
        data[size-1] = null;
        size--;

        //return data[size-1];
        return tail;
    }

    T peek() {
        return data[size-1];
    }


    public T get(int index) {

        if(index >= size) {
            return null;
        }

        return this.data[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new StackIterator<>(this);
    }

    @Override
    public Stream<T> stream() {
        return new Stream<>(this);
    }


    
}
