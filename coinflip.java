import java.util.Random; 

public class coinflip
{
    public static void main(String arg[])
    {
        int H=0;
            int T=1;
            int[] a=new int[5];
            int[] b={00111};
            Random r = new Random(); 
    
            for(int i=0;i<5;i++)
            {
               if(r.nextInt(100) %2 == 0)
               {
                 a[i]=0;
               System.out.print("0");
               }
                else
                    a[i]=1;
                  System.out.print("1");  
            }
             for(int i=0;i<5;i++)
             {
            System.out.print(a[i]);
          //  System.out.print(b[i]);
           //  if(a[i]==b[i])
           //      System.out.println("end");
             }
    }
}