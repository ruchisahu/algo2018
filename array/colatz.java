
package array;

public class colatz {
	 
	   public static void main(String[] args) {
	   //   int n = Integer.parseInt(args[0]);
	    int n=290751111;
		   colatz(n);
	     
	    }
	 
	   public static void colatz(int n) {
	      System.out.println(n );
	      if (n == 1) {
	         return;
	      } else if (n % 2 == 0) {
	          colatz(n / 2);
	      } else {
	         colatz(3*n + 1);
	      }
	   }
	}

