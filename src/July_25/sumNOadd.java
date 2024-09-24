package July_25;

public class sumNOadd
{
	public static void main(String[] args)
	{
		int a=9,b=7;
		String xa = Integer.toBinaryString(a);
		String xb = Integer.toBinaryString(b);
		int p;
		if(xa.length()>xb.length())
		{
			p=xa.length()-xb.length();
			for(int i=0;i<p;i++)
			{
				xb = '0'+xb;
			}
		}
		if(xa.length()<xb.length())
		{
			p=xb.length()-xa.length();
			for(int i=0;i<p;i++)
			{
				xa = '0'+xa;
			}
		}
//		System.out.println(xa +"   "+xb);
		
		int c=0,m=xa.length();
		String sum="";
		char z;
		for(int i=m-1;i>=0;i--)
		{
			if(xa.charAt(i)==xb.charAt(i))
			{
				if(xa.charAt(i)=='1')
				{
					if(c==0)
						z = '0';
					else
						z = '1';
					c=1;
				}
				else
				{
					if(c==1)
						z = '1';
					else
						z = '0';
					c=0;
				}
			}
			else 
			{
				if(c==1)
				{
					z = '0';
					c=1;
				}
				else
				{
					z = '1';
					c=0;
				}
			}
			sum = z + sum;
		}
		if(c==1)
		{
			sum = '1' + sum;
			System.out.println("   "+xa);
			System.out.println("+  "+xb);
		}
		else
		{
			System.out.println("  "+xa);
			System.out.println("+ "+xb);
		}
		for(int i=0;i<=sum.length()+2;i++)
			System.out.print("-");
		System.out.println();
		System.out.println("= "+sum);
		System.out.println();
		System.out.println();
		System.out.println("Sum of "+a+" and "+b+" is : "+Integer.parseInt(sum,2));
	}
}
//c:  1  0  1  0  1  0
//a:  1  1  0  0  0  0
//b:  1  1  1  1  0  0

//(1 1 1 1 0)
//   0 1 1 1 = 7
//   1 0 1 1 = 11
//=1 0 0 1 0 = 18
