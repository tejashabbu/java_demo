package July_25;

public class oneBit
{
	public static void main(String[] args)
	{
		int c=0;
		String s = "000101101100";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='1')
			{
				c++;
			}
		}
		System.out.println("The binary string : "+s+" has hamming weight of : "+c);
	}
}
