package collections.iterators;

import collections.Stack;
import exceptions.Checked;

public class StackIterator<E> implements Iterator<E> {

    private Stack<E> stack;

    public StackIterator(Stack<E> stack) {
        this.stack = stack;
    }


    @Override
    public E next() throws Checked {
        
        if(hasNext()) {
            
            return stack.get(posicao+1);
            
        } 
        
        throw new Checked("Não há elementos na posição indicada.");

    }

    @Override
    public boolean hasNext() {
        
        if(stack.get(posicao+1) == null) {
            
            return true;
        }
        
        return false;
    }
}
