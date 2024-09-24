package July_23;

public class parkingSpace
{
	public static void main(String[] args)
	{
		int r=4,c=7,count=0,max=0;
		int[][] pking = new int[r][c];
		int[][] parking = {{0,1,1,0,1,0,1},{0,0,1,0,1,0,1},{1,1,1,1,1,0,0},{1,0,0,1,0,1,0}};
		pking=parking;
//		for(int i=0;i<r;i++)
//		{
//			for(int j=0;j<c;j++)
//			{
//				//Enter your entry
//			}
//		}
		for(int i=0;i<r;i++)
		{
			int temp=0;
			for(int j=0;j<c;j++)
			{
				if(pking[i][j]==1)
				{
					temp++;
				}
//				System.out.println(temp);
			}
			if(temp>count)
			{
				count = temp;
				max = i;
			}
		}
		System.out.println("The row with most full slots is : "+ (max+1));
	}
}
