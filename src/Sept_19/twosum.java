package Sept_19;

public class twosum
{
	public static void main(String[] args)
	{
		int[] arr = {2,7,11,15};
		int t = 9,i1=-1,i2=-1;
		boolean fl = false;
		for(int i=0;i<arr.length;i++)
		{
			if(!fl)
//			System.out.println(arr[i]+"=i");
			for(int j=0;j<arr.length;j++)
			{
////				System.out.println(arr[j]+"=j");
//				if(arr[i]+arr[j]==t)
//				{
//					fl = true;
//					System.out.println(i+","+j);
//					i1=i;i2=j;
//				}
				if(j!=i && !fl)
				{
					if(arr[i]+arr[j]==t)
					{
						fl = true;
						i1=i;i2=j;
					}
					else
					{
						break;
					}
				}
			}
		}
		if(i1!=-1)
		{
			System.out.println("["+i1+","+i2+"]");
		}
	}
}
