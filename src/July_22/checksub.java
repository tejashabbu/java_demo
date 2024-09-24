package July_22;

public class checksub
{
	public static void main(String[] args)
	{
		String str = "We are solving problems";
		String sub = "solving";
		boolean result = subStringExists(str,sub);
		System.out.println("Existance of '"+sub+"' in '"+str+"' is : "+result);
	}
	
//	@SuppressWarnings("finally")
	public static boolean subStringExists(String S, String s)
	{
		try
		{
			for(int i=0;i<S.length();i++)
			{
				int j=0;
				while(S.charAt(i)==(s.charAt(j)))
				{
					j++;
					i++;
					if(j==s.length())
					{
						return true;
					}
				}
			}
		}
		catch(StringIndexOutOfBoundsException e)
		{
			return false;
		}
		return false;
	}
	
}
