package array;

public class colatz2
{
	public static void main(String[] args) 
	{
		   //   int n = Integer.parseInt(args[0]);
		    int n=290751111;
			   colatz2(n);
		     
		    }

		 
		   public static void colatz2(int n)
		   {
		      System.out.println(n );
		      while(n>1)
		      {
		      if(n % 2 == 0) 
		      {
		          n=n / 2;
		      }
		      
		      else
		      {
		    	  n=3*n + 1;
		      }
		      System.out.println(n);
		   }
		   }
}

