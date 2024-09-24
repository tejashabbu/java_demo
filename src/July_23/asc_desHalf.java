package July_23;

public class asc_desHalf
{
	public static void main(String[] args)
	{
		int[] ar = {5,4,8,6,7,9,0,2,1,3};
		int n = ar.length;
		int m = n/2;
		for(int i=0;i<m;i++)
		{
			for(int j=i+1;j<m;j++)
			{
				if(ar[i]>ar[j])
				{
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		for(int i=m+1;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(ar[i]<ar[j])
				{
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		System.out.println("Sorted array using Selection Sort : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(ar[i]);
		}
	}
}
