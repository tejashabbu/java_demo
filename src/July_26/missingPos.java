package July_26;

public class missingPos
{
	public static void main(String[] args)
	{
		int[] ar = {7,8,9,11,12};
		int flag=0,n=ar.length,b=0;
		for(int i=n;i>=1;i--)
		{
			flag = 0;
			for(int j=0;j<n;j++)
			{
//				System.out.println(j);
				if(i==ar[j])
				{
					flag = 1;
//					System.out.println(ar[j]+" "+i+" "+j);
				}
			}
			if(flag==0)
			{
				b=i;
//				System.out.println(i);
			}
		}
		System.out.println(b);
	}
}
