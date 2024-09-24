package July_22;

public class factorialApp
{
	public static void main(String[] args)
	{
		int num = -2;
//		long fact = calcFact(num);
//		System.out.println("Factorial of '"+num+"' is '"+fact+"'");
		if(num>=0)
		{
			long fact = calcFact(num);
			System.out.println("Factorial of '"+num+"' is '"+fact+"'");
		}
		else
		{
			System.out.println("Enter a positive integer!");
		}
	}

	public static long calcFact(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact *= i;
		}
		return fact;
	}
}