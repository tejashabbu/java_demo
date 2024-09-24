package July_25;

public class maxXor
{
	public static void main(String[] args)
	{
		int[] ar = {2,7,6,5,8,9,12,22};
//		int[] ar = {3,10,5,25,2,8};
		int max=0;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				if(j!=i)
				{
					if((ar[i]^ar[j])>max)
						max = ar[i]^ar[j];
				}
			}
		}
		System.out.println(max);
	}
}
