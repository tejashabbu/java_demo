package July_23;

public class digi
{
	public static void main(String[] args)
	{
		int sum = 0;
		for (int i = 0; i < args.length; i++)
		{
			sum += Integer.parseInt(args[i]);
//			sum += i;
//			System.out.println(args[i]);
		}
		System.out.println(sum);
	}
}
