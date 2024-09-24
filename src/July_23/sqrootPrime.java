package July_23;

public class sqrootPrime
{
	public static void main(String[] args)
	{
		int N = 7;
		float sqvN = 0;
		if(isPrime(N))
		{
			sqvN = (float) Math.sqrt(N);
			System.out.printf("%.2f",sqvN);
		}
	}
	public static boolean isPrime(int n)
	{
		if(n<=1)
			return false;
		int m=n/2;
		for(int i=2;i<=m;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
}
