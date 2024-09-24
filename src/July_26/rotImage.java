package July_26;

public class rotImage 
{
	static void rotate90Clockwise(int a[][],int N)
	{
	    // Traverse each cycle
	    for (int i = 0; i < N / 2; i++)
	    {
	        for (int j = i; j < N - i - 1; j++)
	        {
	 
	            // Swap elements of each cycle
	            // in clockwise direction
	            int temp = a[i][j];
	            a[i][j] = a[N - 1 - j][i];
	            a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j];
	            a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i];
	            a[j][N - 1 - i] = temp;
	        }
	    }
	}
	static void printMatrix(int arr[][],int N)
	{
	    for (int i = 0; i < N; i++)
	    {
	    	System.out.print("[ ");
	        for (int j = 0; j < N; j++)
	        System.out.print( arr[i][j] + " ");
	        System.out.println("]");
//	        System.out.println();
	    }
	}
	public static void main (String[] args) 
    {
            int arr[][] = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 9, 10, 11, 12 },
                      { 13, 14, 15, 16 } };
            int n = 4;
            System.out.println("Original Image :");
            printMatrix(arr,n);
            rotate90Clockwise(arr,n);
            System.out.println();
            System.out.println("Rotated Image :");
            printMatrix(arr,n);
    }
	
}
