package July_26;

public class majEle2
{
	public static void main(String[] args)
	{
		int[] ar = {3,1,1,3,3,2,2};
		int n=ar.length,m=n/3,max=-1;
		for(int i=0;i<n;i++)
		{
			if(i==0)
			{
				int count=0;
				for(int j=0;j<n;j++)
				{
					if(ar[i]==ar[j])
						count++;
				}
				if(count>m)
				{
					max=ar[i];
				}
			}
		}
		if(max==-1)
		{
			System.out.println("Major element doesn't exist!");
		}
		else
		{
			System.out.println("Major element = "+ max);
		}
	}
}
