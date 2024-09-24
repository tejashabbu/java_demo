package July_25;

public class missingNum
{
	public static void main(String[] args)
	{
		int[] a = {2,3,1,5,0,10};
		int min=0,max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
//		int xor = min ^ max;
//		System.out.println(min);
//		System.out.println(max);
		int flag;
		for(int i=min;i<=max;i++)
		{
			flag=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==i)
				{
					flag=1;
				}
			}
			if(flag==0)
			{
				System.out.println(i);
			}
		}
	}
}
