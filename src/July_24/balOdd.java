package July_24;

public class balOdd
{
	public static int[] toAr(int n)
	{
		int[] ar = new int[7];
		int i=0;
		while (n != 0)
		{
			ar[i] = n % 10 ;
			n /= 10 ;
			i++;
		}
		return  ar;
	}
	public static void main(String[] args)
	{
		int n = 1235006,s1=0,s2=0;
		int[] ar = toAr(n);
		int m = ar.length;
		for(int i=0;i<m;i++)
		{
//			System.out.print(ar[i]+" ");
		}
		for(int i=0;i<m/2;i++)
		{
			s1+=ar[i];
			s2+=ar[m-i-1];
		}
		if(s1==s2)
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("Imbalanced");
		}
	}
}
