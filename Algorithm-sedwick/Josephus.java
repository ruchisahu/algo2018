public class Josephus {
    public static void main(String[] args) {
        int m = 5;
        int n = 9;

        // initialize the queue
        Queue<Integer> queue = new Queue<Integer>();
        for (int i = 1; i <= n; i++)
            queue.enqueue(i);

        while (!queue.isEmpty()) {
            for (int i = 0; i < m-1; i++)
                queue.enqueue(queue.dequeue());
            StdOut.print(queue.dequeue() + " ");
        } 
        StdOut.println();
    }
}
