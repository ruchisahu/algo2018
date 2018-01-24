import java.util.NoSuchElementException;

public class QueueWithTwoStack<Item>
{
    private Stack<Item> stack1;
    private Stack<Item> stack2;
    
    public QueueWithTwoStack()
    {
        stack1=new Stack<Item>();
        stack2=new Stack<Item>();
    }
        
        private void moveTostack2()
        {
            while(stack1.isEmpty())
            {
                stack2.push(stack1.pop());
            }

        }
        
        public boolean isEmpty()
        {
            return stack1.isEmpty() && stack2.isEmpty();
        }
        public int size()
        {
            return stack1.size() + stack2.size();
        }
        
        public void enqueue(Item item)
        {
            stack1.push(item);
        }
        public Item dequeue()
        {
            if (isEmpty())
                throw new NoSuchElementException("Queue underflow");
        if (stack2.isEmpty())
            moveTostack2();
        return stack2.pop();
        }
       public static void main(String[] args) {
        QueueWithTwoStack<String> q = new QueueWithTwoStack<String>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) q.enqueue(item);
            else if (!q.isEmpty()) StdOut.print(q.dequeue() + " ");
        }
        StdOut.println("(" + q.size() + " left on queue)");
    }
}