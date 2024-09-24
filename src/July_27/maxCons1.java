package July_27;

public class maxCons1 
{
	public static void main(String[] args)
	{
		int[] ar = {1,1,1,0,1,1,0,1,0,1,1,1,1,0};
		int max=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==1)
			{
				int count=1;
				while(ar[i+1]==1)
				{
					count++;
					i++;
					if(i+1==ar.length)
					{
						i--;
					}
//						break;
				}
				if(count>max)
					max=count;
			}
		}
		System.out.println(max);
	}
}
//i=4---if=true---c=1---while=true---c=2---i=5