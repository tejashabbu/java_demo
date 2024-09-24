package July_24;

public class rotMat
{
	public static void main(String[] args)
	{
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<3;i++)
		{
			System.out.print("[ ");
			for(int j=0;j<3;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println("]");
		}
		rotate(mat);
	}
	public static void rotate(int[][] a)
	{
		int temp1 = a[0][0];
		int temp2 = a[0][1];
//		for(int j=2;j>0;j--)
//		{
//			a[0][j] = a[0][j-1];
//		}
//		a[0][0] = a[1][0];
//		 
//		a[2][2]
//		a[1][2] = temp;
		a[0][0] = a[0][2];
		a[0][2] = a[2][2];
		a[2][2] = a[2][0];
		a[2][0] = temp1;
		
		a[0][1] = a[1][2];
		a[1][2] = a[2][1];
		a[2][1] = a[1][0];
		a[1][0] = temp2;
		
//		for(int i=2;i>=0;i--)
//		{
//			for(int j=0;j<3;j++)
//			{
//				a[j][i] = a[2-i][j];
//			}
//		}
//		a[][] = temp;
		System.out.println("Rotated matrix(90) : ");
		for(int i=0;i<3;i++)
		{
			System.out.print("[ ");
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("]");
		}
	}
}
