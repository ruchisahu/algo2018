public class set_count
{
    static int count(int n)
    {
        int count=0;
    
        while (n != 0) {
          n &= (n - 1);
          count++;
        }
        
        return count;
        
    }
    public static void main(String[] args)
    {
        set_count set=new set_count();
        int n=3;
        System.out.println(set.count(n));
        
    }
}



