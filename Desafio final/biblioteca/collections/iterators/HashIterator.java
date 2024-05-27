package collections.iterators;

import collections.Hash;
import exceptions.Checked;

public class HashIterator<E> implements Iterator<E> {

    private Hash<E> hash;
    int posicao = -1, chave = 0;

    LinkedListIterator<E> lista;


    public HashIterator (Hash<E> hash){
        this.hash = hash;
    }

    @Override
    public E next() throws Checked{
        return hash.getList(chave).get(posicao);
    }

    @Override
    public boolean hasNext() {
        while (chave < hash.tamanho){
            while(hash.getList(chave) == null){
                chave++;
            }
            if (hash.getList(chave).get(posicao + 1) != null){
                posicao++;
                return true;
            }
            posicao = -1;
            chave++;
        }
        return false;
    }
}
