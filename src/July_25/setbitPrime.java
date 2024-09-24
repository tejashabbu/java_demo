package July_25;

public class setbitPrime
{
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
	public static void main(String[] args)
	{
		int l=3,r=7,prime=0;
		int n = r-l+1;
		String[] S = new String[n];
		int[] ar = new int[n];
		for(int i=0;i<n;i++)
		{
			int count = 0;
			S[i] = Integer.toBinaryString(i+l);
			for(int j=0;j<S[i].length();j++)
			{
				if(S[i].charAt(j)=='1')
				{
					count++;
				}
			}
			ar[i] = count;
			if(isPrime(ar[i]))
				prime++;
			
		}
//		for(int i=0;i<n;i++)
//		{
//			System.out.println(S[i]);
//			System.out.println(ar[i]);
//		}
		System.out.println(prime+" prime setBits exist in range "+l+" and "+r);
	}
}
