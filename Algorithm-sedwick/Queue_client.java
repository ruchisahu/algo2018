
public class Queue_client
{
    public static void main(String[] args) 
    {
        Queue<String> queue = new Queue<String>();
         String filename = "eq.txt";
        In in = new In(filename);
        while (!in.isEmpty()) {
            String item = in.readString();
            if (!item.equals("-"))
                queue.enqueue(item);
            else if (!queue.isEmpty())
                StdOut.print(queue.dequeue() + " ");
        }
        StdOut.println("(" + queue.size() + " left on queue)");
    }
}
