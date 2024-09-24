package July_24;

public class rotArr
{
	public static void main(String[] args)
	{
		int[] ar = {2,3,4,5,6,7,1};
		int n= ar.length-1;
		int temp=ar[n];
		System.out.print("Original array : {");
		for (int i=0;i<n;i++)
		{
			System.out.print(ar[i]+",");
		}
		System.out.println(ar[n]+"}");
		for(int i=n;i>0;i--)
		{
			ar[i]=ar[i-1];
//			System.out.println(ar[i]);
		}
		ar[0]=temp;
		System.out.print("Rotated array : {");
		for (int i=0;i<n;i++)
		{
			System.out.print(ar[i]+",");
		}
		System.out.println(ar[n]+"}");
	}
}
