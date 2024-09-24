package July_24;

public class largArr
{
	public static void main(String[] args)
	{
		int[] arr = {1,8,7,56,90};
		int n = arr.length;
		int b=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>=b)
			{
				b=arr[i];
			}
		}
		System.out.println("Largest number : "+b);
	}
}
