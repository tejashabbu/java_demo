package July_22;

public class pyramids
{
	public static void half(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=i+1;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void inverted(int n)
	{
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void hollow(int n)
	{
		System.out.println("1");
		for(int i=0;i<n-2;i++)
		{
			System.out.print("1 ");
			for(int j=0;j<i;j++)
			{
				System.out.print("  ");
			}
			System.out.println(i+2);
		}
		for(int i=0;i<n;i++)
		{
			System.out.print((i+1)+" ");
		}
	}
	
	public static void main(String[] args)
	{
		half(5);
		System.out.println();
		inverted(5);
		System.out.println();
		hollow(5);
	}
}

