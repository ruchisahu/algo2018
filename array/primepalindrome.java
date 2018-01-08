package array;

public class primepalindrome 
{
	public static void main(String[] args)
	{
		primepalindrome p=new primepalindrome();
		p.showprime();
	}
	
	public void showprime()
	{
		for(int j=1;j<=1000;j++)
		{
			if(isPalindrome(j))
			{
				if(isPrime(j))
			{
				System.out.println("value=" +j);
				}
					}
		}
	}
 boolean isPrime(int n)
{
//	 System.out.println("isprime");
	if(n<2)
		return false;
	
	for(int i=2;i<=n-1;i++)
	{
	   if(n%i==0)
		   return false;
	}
	
	return true;
	}         

boolean isPalindrome(int n)
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
	if(rev==copy)
		return true;
	else 
		return false;
} 
 
}
