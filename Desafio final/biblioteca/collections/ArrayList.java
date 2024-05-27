package collections;

import collections.iterators.ArrayListIterator;
import collections.iterators.Iterable;
import collections.iterators.Iterator;
import collections.iterators.Stream;

public class ArrayList<T> extends List<T> implements Iterable<T>
{
    private T[] data;


    public ArrayList(){
        data = (T[])(new Object[10]);
    }


    @Override
    public T get(int index) 
    {
        if (index >= size)
            return null;
        return this.data[index];
    }


    @Override
    public void set(int index, T value) {
        this.data[index] = value;    
    }

    
    @Override
    public void add(T value)
    {
        if (size == data.length)
        {
            T[] copy = (T[])(new Object[2 * data.length]);
            for (int i = 0; i< size; i++)
                copy[i] = data[i];
            data = copy;
        }
        data[size] = value;
        size++;
    }

    @Override
    public Integer size() {
        return size;
    }

    @Override
    protected void setSize(Integer size) {
        this.size = size;
    }


    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator<>(this);
    }


    @Override
    public Stream<T> stream() {
        return new Stream<>(this);
    }

}
