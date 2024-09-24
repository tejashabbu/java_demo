package July_23;

public class sumPrime
{
	public static void main(String[] args)
	{
		int N1 = 1, N2 = 50,sum = 0;
		for(int i=N1;i<=N2;i++)
		{
			if(isPrime(i))
			{
				sum+=i;
			}
		}
//		System.out.println(isPrime(1));
		System.out.println("Sum of prime numbers between "+N1+" and "+N2+" is : "+sum);
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
