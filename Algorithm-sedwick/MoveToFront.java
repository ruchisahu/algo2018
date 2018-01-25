//Ex-1.3.40 MoveToFront :read a seq of char with no duplicates.if unseen insert it otherwise delete it and reinsert it again at the beginning.



public class MoveToFront
{
    private Node first;
    private static class Node
    {
     private char item;
       private Node next;

        public Node(char item, Node next) 
        {
            this.item = item;
            this.next = next;
        }
    }
    
    public boolean isEmpty() 
    {
        return first == null;
    }
       
    private Node delete(Node x,char item)
    {
          if (x == null) return null;
        if (x.item == item) return x.next;
        x.next = delete(x.next, item);
        return x;
    }
    void add(char item)
    {
     
        first=delete(first,item);
        first=new Node(item,first);
     
    }
 public String toString() {
        Node node = first;
        StringBuilder sb = new StringBuilder();
        while (node != null) {
            sb.append(node.item).append(" ");
            node = node.next;
        }
        
        return sb.toString();
}
    public static void main(String[] args)
    {
        MoveToFront mf=new MoveToFront();
        String s="abcdaber";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            mf.add(c);
                        
        }
         StdOut.print("STRING=" +mf.toString());
    }
}