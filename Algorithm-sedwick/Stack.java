
import java.util.Iterator;

public class Stack<Item> implements Iterable<Item>
{
    private Item[] a=(Item[])new Object[1];
    int N=0;
    
    int size()
    {
        return N;
    }
    private  void resize(int max)
    {
        Item[] temp=(Item[])new Object[max];
        for(int i=0;i<N;i++)
        {
            temp[i]=a[i];
           
        }
         a=temp;
    }
    
    public void push(Item item)
    {
        if(N==a.length)
            resize(2*a.length);
        a[N++]=item;
            
    }
    public Item pop()
    {
        Item item=a[--N];
        return item;
    }
    
    public boolean isEmpty()
    {
        return N==0;
    }
    
    public Iterator<Item> iterator()
    {
        return new Reverse();
    }
    
    private class Reverse implements Iterator<Item>
    {
        private int i=N;
        public boolean hasNext()
        {
            return i>0;
        }
        public Item next()
        {
            return a[--i];
        }
        public void remove()
        {}
    }
    
    
    
    
  }