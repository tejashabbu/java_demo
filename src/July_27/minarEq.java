package July_27;

public class minarEq
{
	public static void main(String[] args)
	{
		int[] ar = {1,10,2,9};
		int avg=0,count=0;
		for(int i=0;i<ar.length;i++)
		{
			avg += ar[i];
		}
		avg /= ar.length;
//		avg = 6;
//		System.out.println(avg);
		for(int i=0;i<ar.length;i++)
		{
			int temp = ar[i]-avg;
			if(temp<0)
				temp *= -1;
//			System.out.println(temp);
			count+=temp;
		}
		System.out.println(count);
	}
}
