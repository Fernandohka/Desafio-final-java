package collections;

import collections.iterators.HashIterator;
import collections.iterators.Iterable;
import collections.iterators.Iterator;
import collections.iterators.Stream;

public class Hash<T> extends Size implements Iterable<T>
{

    LinkedList<T> list[];
    
    public int tamanho = 10;
    
    public Hash(){
        this.list = (LinkedList<T>[])(new LinkedList[tamanho]);
    }
    
    public Hash(int tamanho){
        this.list = (LinkedList<T>[])(new LinkedList[tamanho]);
    }
    
    public void add(int chave, T value){
        if(list[chave % tamanho] == null)
        list[chave % tamanho] = new LinkedList<T>();
        
        list[chave % tamanho].add(value);
        size++;
    }
    
    public T get(int chave, T value){
        for(int i = 0; list[chave % tamanho].get(i) != null; i++)
        {
            if (list[chave % tamanho].get(i) == value)
            return list[chave % tamanho].get(i);
        }
        
        return null;
    }
    
    @Override
    public Integer size() {
        return size;
    }
    
    @Override
    protected void setSize(Integer size) {
        this.size = size;
    }
    
    public LinkedList<T> getList(int chave) {
        return list[chave % tamanho];
    }
    
    public void setList(LinkedList<T>[] list) {
        this.list = list;
    }

    @Override
    public Iterator<T> iterator() {
        return new HashIterator<>(this);
    }

    @Override
    public Stream<T> stream() {
        return new Stream<>(this);
    }

}
