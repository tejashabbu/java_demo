package July_23;

public class posPrime
{
	public static boolean check(int n)
	{
		if(n>0)
			return true;
		else
			return false;
	}
	public static boolean prime(int n)
	{
		int m=n/2;
		for(int i=2;i<=m;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		int n=7;
		if(check(n))
		{
			System.out.println(n+" is prime? :-> "+ prime(n));
		}
	}
}
