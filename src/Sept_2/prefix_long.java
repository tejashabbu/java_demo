package Sept_2;

//strs = ["flower","flow","flight"]

public class prefix_long 
{
	public static void main(String[] args)
	{
		String[] strs = {"flower","flow","flight"};
		int pre=0;
		int m=strs[0].length();
		for(int i=0;i<strs.length;i++)
		{
			if(strs[i].length() < m)
			{
				m = strs[i].length();
			}
		}
		boolean f=true;
		for(int j=0;j<m;j++)
		{
			char s = strs[0].charAt(j);
			for(int i=0;i<strs.length;i++)
			{
				if(strs[i].charAt(j)!=s)
				{
					f = false;
					break;
				}
			}
			if(f)
			{
				pre++;
			}
		}
		for(int i=0;i<pre;i++)
		{
			System.out.print(strs[0].charAt(i));
		}
	}
}
