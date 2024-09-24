package July_24;

public class prodMaxMin
{
	public static void main(String[] args)
	{
		int[] a = {2,3,5,4,7,8};
		int[] b = {3,4,2,8,5,6};
		int max = 0,min=b[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
			if(b[i]<min)
				min=b[i];
		}
		int prod = max*min;
		System.out.println(prod);
	}
}
