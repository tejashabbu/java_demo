package July_24;

public class uplowSum
{
	public static void main(String[] args)
	{
		int n = 3;
		int[][] mat = {{6,5,4},
					   {1,2,5},
					   {7,9,7}};
		int su=0,sl=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				su+=mat[i][j];
			}
			for(int j=n-1;j>n-i-2;j--)
			{
//				System.out.println(mat[i][j]);
				sl+=mat[i][j];
			}
		}
		System.out.println("Upper Traingle sum : "+su);
		System.out.println("Lower Traingle sum : "+sl);
	}
}