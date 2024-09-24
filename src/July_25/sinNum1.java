package July_25;

public class sinNum1
{
	public static void main(String[] args)
	{
		int[] arr = {2,3,4,2,4};
		int x1 = 0;
//		System.out.println(x1);
//		x1 = x1^3;
//		System.out.println(x1);
//		x1 = x1^4;
//		System.out.println(x1);
//		x1 = x1^4;
//		System.out.println(x1);
//		x1 = x1^3;
//		System.out.println(x1);
		for(int i=0;i<arr.length;i++)
		{
			x1 ^= arr[i];
		}
		System.out.println(x1);
	}
}
