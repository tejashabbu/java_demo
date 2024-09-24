package Sept_3;
import java.util.List;
//import java.util.ArrayList;

public class long_dict
{
	public static void main(String[] args)
	{
		String s = "acpcplea";
		String[] Dict = {"ale","apple","monkey","plea"};
		int a = select(s,Dict);
		System.out.println(a);
	}
	
	@SuppressWarnings("null")
	public static int select(String s,String[] d)
	{
		int ans=-1,b=0;
		List<Integer> a=null;
//		boolean f = true;
		for(int i=0;i<d.length;i++)
		{
			int j=0,c=0;
			while(j<d[i].length())
			{
				for(int k=0;k<s.length();k++)
				{
					if(d[i].charAt(j)==s.charAt(k))
					{
						j++;
						c++;
					}
				}
			}
			if(c==d[i].length())
				a.add(i);
				b++;
		}
		for(int i=0;i<b;i++)
		{
			if(ans<a.get(i))
				ans=a.get(i);
		}
		return ans;
	}
}
