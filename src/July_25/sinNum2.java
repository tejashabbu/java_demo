package July_25;

public class sinNum2
{
	public static void main(String[] args) 
	{
		int[] ar = {3,4,3,4,4,3,5};
		int n=ar.length;
		//arrange in ascending
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(ar[i]>ar[j])
				{
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.println();
		int i;
		//check if 3 in a row are same
		for(i=0;i<n-2;i+=3)
		{
			if(!(ar[i]==ar[i+1]&&ar[i]==ar[i+2]))//if not
			{
				System.out.println(ar[i]);//return first of 3
			}
		}
//		if(i==n-1)
//		{
//			System.out.println(ar[n-1]);
//		}
		//return first of 3
	}
}
