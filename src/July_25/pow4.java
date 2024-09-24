package July_25;

public class pow4
{
	public static void main(String[] args)
	{
		int n=1024,a=n,p=0;
		while(a%4==0)
		{
			a/=4;
			p++;
		}
		if(a==1)
		{
			System.out.println(true);
			System.out.println("4 to the power "+p+" = "+n);
		}
		else
		{
			System.out.println(false);
		}
	}
}
