package July_25;

public class numCompl
{
	public static void main(String[] args)
	{
		int n = 5;
//		System.out.println("your number : "+n);
		String sn = Integer.toBinaryString(n),sm = "";
//		System.out.println(sn);
		for(int i=0;i<sn.length();i++)
		{
			if(sn.charAt(i)=='0')
				sm += '1';
			else
				sm += '0';
		}
//		System.out.println(sm);
		int m = Integer.parseInt(sm,2);
		System.out.println("The complement of "+n+"["+sn+"] is "+m+"["+sm+"]");
	}
}
