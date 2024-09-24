package July_26;

public class sumRange
{
	public static void main(String[] args)
	{
		//      i = 0 1 2 3 4 5 6 `7 8 
		int[] ar = {0,1,3,5,8,9,10,12};
//		System.out.println("ar len : "+ar.length);
		int flag=0;
		for(int i=1;i<ar.length;i++)
		{
			if((ar[i-1]+1)==(ar[i]))
			{
				System.out.print("("+ar[i-1]+"->");
				i++;
				if(i==ar.length)
				{
					System.out.print(ar[i-1]+")");
				}
				else
				{
					while((ar[i-1]+1)==ar[i])
					{
						i++;
						if(i==ar.length)
						{
							flag=1;
							break;
						}
					}
//					System.out.print("|i:"+i+"|");
//					if(i==ar.length)
//					{
//						System.out.print(ar[i-1]+")");
//					}
//					else
//					{
						System.out.print(ar[i-1]+") ");
						System.out.println();
//						i--;
//					}
				}
			}
			else
			{
				System.out.println("("+ar[i-1]+")");

			}
		}
		if(flag==0)
		{
			System.out.print("("+ar[ar.length-1]+")");
		}
	}
}
