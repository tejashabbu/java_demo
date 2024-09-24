package July_23;

public class JAR
{
	int n,m,k;
	public JAR(int n, int m,int k)
	{
		this.n = n;
		this.m = m;
		this.k = k;
	}
	public void sell(int a)
	{
		if((m-a)<=0)
		{
			System.out.println("Select lesser candies");
		}
		else
		{
			m-=a;
			System.out.println("Here are your "+a+" candies!");
			System.out.println("Enjoy :)");
			System.out.println("The JAR has "+m+" candies left out of "+n);
			if(m<=k)
			{
				m=n;
				System.out.println("The JAR has been refilled with candies!!(20 of 20)!!");
			}
		}
	}
}
