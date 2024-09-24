package July_27;

public class islandPeri
{
	public static void main(String[] args) 
	{
		int[][] arr = {{0,0,0,0,0},{0,0,1,0,0},{0,1,1,1,0},{0,0,1,0,0},{0,1,1,0,0},{0,0,0,0,0}};
		int p=0;
		for(int i=1;i<arr.length-1;i++)
		{
			for(int j=1;j<arr[i].length-1;j++)
			{
				if(arr[i][j]==1)
					p += checksurr(arr, i, j);
			}
		}
		System.out.println(p);
	}
	public static int checksurr(int[][] ar,int i,int j)
	{
		int c=0;
		if(ar[i-1][j]==0)
		{
			c++;
		}
		if(ar[i+1][j]==0)
		{
			c++;
		}
		if(ar[i][j-1]==0)
		{
			c++;
		}
		if(ar[i][j+1]==0)
		{
			c++;
		}
//		System.out.println(c);
		return c;
		
	}
}
//  0 1 0 0
//  1 1 1 0
//  0 1 0 0
//  1 1 0 0
// 4 4 4 4

