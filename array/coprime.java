
package array;
import java.util.ArrayList;
import java.util.List;

public class coprime
{
	class CoPrimePair {
		private int a;
		private int b;
		CoPrimePair(int x, int y) {
			a = x; b = y;
		}
		public int getA() {
			return a;
		}
		public int getB() {
			return b;
		}
		@Override
		public String toString() {
			return "{" + getA() + ", " + getB() + "}";
		}
	}
	public static int gcd(int a,int b)
	{
		if(b==0)
		{
			System.out.println(a);
			return a;
		}
		else
			return gcd(b,a%b);
	}
	boolean coprime(int x,int y)
	{
		return gcd(x,y)==1;
	}
	
	public static int rev(int n)
	{

		int rev=0;
		int d;
		int copy=n;
		while(n>0)
		{
			d=n%10;
			//System.out.println(d);
			rev=rev*10+d;
		//	System.out.println(rev);
			n=n/10;
		//	System.out.println(n);
		}
		return rev;
	} 
public static void main(String[] args)
{
	//int[] a= {1,2,3,4,5,6,13,14,15,16,17};
	coprime co=new coprime();
	//co.gcd(10,15);
//	co.coprime(10,15);
	
	for(int x=10;x<=1000;x++)
	{
		int y=rev(x);
		co.coprime(x,y);
	}
//	List<CoprimePair> coprimelist=new ArrayList<>();
	
	
}
}
