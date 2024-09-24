package July_22;

public class sec_third
{
	public static void main(String[] args)
	{
		int[] arr = {3,7,1,2,6,17,10,11};
//		int[] arr = {3,7,1,1,2,6,17,10,11,17};
		int n=arr.length;
		int l1=0,l2=0,s1=arr[0],s2=arr[0],s3=arr[0];
		if(n==1)
		{
			l1=l2=s1=s2=s3=arr[0];
		}
		else
		{
			for(int i=0;i<n;i++)
			{
				if(arr[i]>l2)
				{
					l2 = arr[i];
				}
				if(l2>l1)
				{
					int temp = l2;
					l2 = l1;
					l1 = temp;
				}
			}
			for(int i=0;i<n;i++)
			{
				if(arr[i]<s3)
				{
					s3 = arr[i];
				}
				if(s3<s2)
				{
					int temp = s3;
					s3 = s2;
					s2 = temp;
				}
				if(s1>s2)
				{
					int temp = s1;
					s1 = s2;
					s2 = temp;
				}
				
			}
		}
		System.out.println("Second largest is : "+l2);
		System.out.println("Third smallest is : "+s3);
	}
}
