package July_25;

public class binaryGap
{
	public static void main(String[] args)
	{
		int n=22,max = 0;
		String sn = Integer.toBinaryString(n);
//		String sn = "101001";
		System.out.println(sn);
		for(int i=0;i<sn.length();i++)
		{
			if(sn.charAt(i)=='1')
			{
				int count = 0,j=i+1;
				while(j<sn.length() && sn.charAt(j)=='0')
				{
					count++;
					j++;
				}
//				System.out.println(count);
				if(count>max)
				{
					max = count;
				}
			}
		}
		System.out.println(max+1);
	}
}
