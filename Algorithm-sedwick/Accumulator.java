public class Accumulator
{
    private double total;
    private int N;
    public void addDataVlue(double val)
    {
        N++;
        total+=val;
    }
    public double mean()
    {
        return total/N;
    }
    public String toString() {
        return "Mean (" + N + " values): " + String.format("%7.5f", mean());
    }
    
    public static void main(String[] args)
    {
        int T=Integer.parseInt(args[]);
    }
}
