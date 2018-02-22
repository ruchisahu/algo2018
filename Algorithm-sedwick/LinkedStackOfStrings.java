import java.util.NoSuchElementException;

public class LinkedStackOfStrings 
{
    Node first;
    int N;
    private class Node
    {
           String item;
             Node next;
    }  
        boolean isEmpty()
        {
            return first==null;
        }
        int size()
        {
            return N;
        }
        public void push(String item)
        {
            Node oldfirst=first;
            first=new Node();
            first.item = item;
        first.next = oldfirst;
        N++;
        }
        public String pop()
        {
            if (isEmpty()) throw new NoSuchElementException("stack underflow");
            String item=first.item;
            N--;
            return item;
        }
    
    public void main(String[] args)
    {
        LinkedStackOfStrings stack = new LinkedStackOfStrings();
       String filename = "stackclient.txt";
       In in = new In(filename);
    //    String s="abbc";
        while(!in.isEmpty())
        {
            String item=in.readString();
            StdOut.println(item); 
            if(!item.equals("_"))
                stack.push(item);
            else if(stack.isEmpty())
                StdOut.println("BAD INPUT"); 
            else                     
                StdOut.print(stack.pop());
        } 
        
    }
}



        
    
