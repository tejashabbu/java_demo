package July_26;

public class remDup
{
	public static void main(String[] args)
	{
		int c=0;
		int[] ar = {2,3,4,4,5,5,6,6,7};
		for(int i=0;i<ar.length-1-c;i++)
		{
			if(ar[i]==ar[i+1])
			{
				remove(ar,i+1);
//				for(int j=0;j<ar.length;j++)
//				{
//					System.out.print(ar[j]+" ");
//				}
//				System.out.println();
				c++;
//				System.out.println(c);
			}
		}
//		System.out.println(c);
		for(int i=0;i<ar.length-c;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
	public static void remove(int[] a,int i)
	{
		for(int j=i;j<a.length-1;j++)
		{
			a[j]=a[j+1];
		}
	}
}
