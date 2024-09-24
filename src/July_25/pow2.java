package July_25;

public class pow2
{
	public static void main(String[] args)
	{
		int n=1024,a=n,p=0;
		while(a%2==0 && a%2!=1)
		{
			a/=2;
			p++;
		}
		if(a==1)
		{
			System.out.println(true);
			System.out.println("2 to the power "+p+" = "+n);
		}
		else
		{
			System.out.println(false);
		}
	}
}
