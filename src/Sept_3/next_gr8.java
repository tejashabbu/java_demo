package Sept_3;
import java.util.*;

//87632

public class next_gr8
{
	public static void main(String[] args)
	{
		int num = 5476321;
		List<Integer> lnum = cvttolist(num);
		System.out.println(lnum);
//		Collections.swap(lnum, 0, 1);
//		int temp = lnum.get(0);
//		lnum.add(0, lnum.get(1));
//		lnum.add(1,temp);
		make_gr8(lnum);
//		System.out.println(lnum);
	}

	private static List<Integer> cvttolist(int num)
	{
		List<Integer> l=new ArrayList<Integer>();
		int rem = num;
		String str = String.valueOf(num);
		for(int i=0;i<str.length();i++)
		{
			l.add(rem%10);
			rem = rem/10;
		}
		return l;
	}
	
	public static void make_gr8(List<Integer> l)
	{
		boolean f = false;
		for(int i=0;i<l.size();i++)
		{
			for(int j=i+1;j<l.size();j++)
			{
				if(l.get(i)>l.get(j))
				{
					Collections.swap(l, i, j);
					f = true;
					break;
				}
			}
			if(f)
				break;
		}
		int fin=0;
		for(int i=l.size()-1;i>=0;i--)
		{
			fin += l.get(i)*(Math.pow(10, i));
		}
		System.out.println(fin);
	}
}
