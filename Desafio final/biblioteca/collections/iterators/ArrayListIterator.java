package collections.iterators;

import collections.ArrayList;
import exceptions.Checked;

public class ArrayListIterator<E> implements Iterator<E>{

    private ArrayList<E> array;

     public ArrayListIterator (ArrayList<E> array) {
        this.array = array;
    }

    @Override
    public E next() throws Checked {
        
        if(hasNext()) {
            
            return array.get(posicao+1);
            
        } 
        
        throw new Checked("Não há elementos na posição indicada.");

    }

    @Override
    public boolean hasNext() {
        
        if(array.get(posicao+1) == null) {
            
            return true;
        }
        
        return false;
    }
    
}
