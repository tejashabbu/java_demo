package July_26;

public class matrixSearch2
{
	public static void main(String[] args)
	{
		int[][] ar = {{1,4,7,11},{2,6,8,12},{23,7,9,16},{10,13,14,17}};
		int n=7;
		boolean t = false;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				if(ar[i][j]==n)
				{
					t=true;
				}
			}
		}
		System.out.println(t);
	}
}
