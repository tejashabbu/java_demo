package July_24;

public class matrSum
{
	public static void main(String[] args)
	{
		int n=2,m=3,sum=0;
		int[][] ma = new int[n][m];
		int[][] mat = {{1,0,1},{-8,9,-2}};
		ma = mat;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				sum+=ma[i][j];
			}
		}
		System.out.println(sum);
	}
}
