package Sept_2;

public class haystack_needle
{
	public static void main(String[] args)
	{
		String hay = "hello",nee = "ll";
		int l = nee.length(),pos=-1;
		boolean f=true;
		for(int j=0;j<hay.length();j++)
		{
			f=true;
			int k=j,p=j;
			for(int i=0;i<l;i++)
			{
				if(nee.charAt(i)!=hay.charAt(p))
				{
					f=false;
					break;
				}
				else
				{
					p++;
				}
			}
			if(f)
			{
				pos=k;
			}
		}
		if(hay.length()<=0)
			pos = 0;
		System.out.println(pos);
	}
}
