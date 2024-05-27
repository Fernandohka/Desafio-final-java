package collections.iterators;

import collections.ArrayList;
import collections.List;
import java.util.function.Function;

public class Stream<E> {
    
    Iterable<E> iterable;

    public Stream(Iterable<E> iterable) {
        
        this.iterable = iterable;
    }

    public <R> Stream<R> map(Function<E, R> func) 
    {
        Iterator<E> it = iterable.iterator();
        E valor;
        ArrayList<R> lista = new ArrayList<>();

        while(it.hasNext())
        {
            valor = it.next();
            lista.add(func.apply(valor));
        }
        
        return lista.stream();
    }
    
    public Stream<E> filter(Function<E, Boolean> func) 
    {
        Iterator<E> it = iterable.iterator();
        E valor;
        ArrayList<E> lista = new ArrayList<>();

        while(it.hasNext())
        {
            valor = it.next();

            if(func.apply(valor))
            {
                lista.add(valor);
            }
        }
        
        return lista.stream();
    }

    public List<E> collect() 
    {
        Iterator<E> it = iterable.iterator();
        ArrayList<E> result = new ArrayList<>();

        while (it.hasNext()) 
        {
            result.add(it.next());    
        }

        return result;
    }
        
}