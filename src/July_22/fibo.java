package July_22;

public class fibo
{
	public static void main(String[] args)
	{
		int m=7;
		int[] fib = new int[m];
		fib[0] = 0;
		fib[1] = 1;
		for(int i=2;i<m;i++)
		{
			fib[i] = fibon(i,fib);
		}
		for(int i=0;i<m;i++)
		{
			System.out.print(fib[i] + " ");
		}
	}

	public static int fibon(int i, int[] fib)
	{
		return (fib[i-1]+fib[i-2]);
	}
}
