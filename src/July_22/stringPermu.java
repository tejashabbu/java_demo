package July_22;

public class stringPermu
{
	public static void main(String[] args)
	{
//		String str = "Mustang";
	}
	public static void printStr(String s)
	{
		int n = s.length();
		for(int i=0;i<n;i++)
		{
			System.out.print(s.charAt(i));
			for(int j=i+1;j<n;j++)
			{
				System.out.println(s.charAt(j));
			}
		}
	}
}
