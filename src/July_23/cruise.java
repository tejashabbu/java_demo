package July_23;

public class cruise
{
	public static void main(String[] args)
	{
		int T=5,c=0,b=0;
		int[] E = {7,0,5,1,3},L= {1,2,1,3,4};
		for( int i=0;i<T;i++)
		{
			c+=E[i];
			c-=L[i];
			if(b<c)
			{
				b=c;
			}
		}
		System.out.println("Current members on ship : "+c);
		System.out.println("Max people on cruise was : "+b);
	}
}
