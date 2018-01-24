import java.util.Iterator;
import java.util.NoSuchElementException;


class stack_node<Item> implements Iterable<Item>
{
    Node<Item> first;
    int N;
    private static class Node<Item>
    {
        
            Node next;
            Item item;
       
    }
    
    int size()
    {
        return N;
    }
    
    public stack_node()
    {
        first=null;
        N=0;
    }
    
    boolean isEmpty()
    {
        return first==null;
    }
    
    
    public void push(Item item)
    {
        Node<Item> oldfirst=first;
        first=new Node<Item>();
        first.item=item;
        first.next=oldfirst;
        N++;
    }
    
    
   public Item pop() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        Item item = first.item;        // save item to return
        first = first.next;            // delete first node
        N--;
        return item;                   // return the saved item
}
    public String toString()
    {
    StringBuilder s = new StringBuilder();
        for (Item item : this) {
            s.append(item);
            s.append(' ');
        }
        return s.toString();
}
     public Iterator<Item> iterator() {
        return new ListIterator<Item>(first);
    }

    // an iterator, doesn't implement remove() since it's optional
    private class ListIterator<Item> implements Iterator<Item> {
        private Node<Item> current;

        public ListIterator(Node<Item> first) {
            current = first;
        }

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next; 
            return item;
        }
    }

    public static void main(String[] args)
    {
        stack_node<String> s=new stack_node<String>();
        
          String filename = "eq.txt";
        In in = new In(filename);
         while (!in.isEmpty()) {
            String item = in.readString();
            if (!item.equals("-"))
                s.push(item);
            else if (!s.isEmpty())
                StdOut.print(s.pop() + " ");
        }
        StdOut.println("(" + s.size() + " left on stack)");
    }
}
