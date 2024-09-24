package July_26;

public class thirdMax
{
	public static void main(String[] args)
	{
		int[] ar = {2,3,7,6,5,4,8,9};
		int m1=0,m2=0,m3=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>m3)
			{
				m3=ar[i];
			}
			
			if(m3>m2)
			{
				int temp=m3;
				m3=m2;
				m2=temp;
			}
			
			if(m2>m1)
			{
				int temp=m1;
				m1=m2;
				m2=temp;
			}
		}
		System.out.println("Third largest : "+m3);
	}
}
