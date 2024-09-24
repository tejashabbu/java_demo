package July_26;

import java.util.ArrayList;
import java.util.List;

public class setMat_0
{
	public static void main(String[] args)
	{
		int[][] ar = {{0,1,0,2},{1,3,5,2},{1,2,5,1}};
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		List<Integer> zi = new ArrayList<Integer>();
		List<Integer> zj = new ArrayList<Integer>();
		int c=0;
//		boolean[][] zero = new boolean[ar.length][ar[0].length];
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				if(ar[i][j]==0)
				{
					zi.add(i);
					zj.add(j);
					c++;
//					zero[i][j] = true;
				}
			}
		}
//		System.out.println(c);
//		System.out.println(zi);
//		System.out.println(zj);
		for(int i=0;i<ar.length;i++)
		{
			for(int k=0;k<c;k++)
			{
				if(zi.get(k)==i)
				{
					for(int j=0;j<ar[i].length;j++)
					{
						ar[i][j]=0;
					}
				}
			}
		}
		for(int j=0;j<ar[0].length;j++)
		{
			for(int k=0;k<c;k++)
			{
				if(zj.get(k)==j)
				{
					for(int i=0;i<ar.length;i++)
					{
						ar[i][j]=0;
					}
				}
			}
		}
//		for(int i=0;)
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
