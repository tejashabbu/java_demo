package July_23;

public class monkey
{
	public static void main(String[] args)
	{
		int n=20,k=2,j=3,b=12,p=12;
		while(b>=k||p>=j)
		{
			n-=1;
			if(b>=k)
				b-=k;
			else if(p>=j)
				p-=j;
		}
		if(b>0)
		{
			b=0;
			n-=1;
		}
		if(p>0)
		{
			k=0;
			n-=1;
		}
		System.out.println("Monkeys left on tree : "+n);	
	}
}
