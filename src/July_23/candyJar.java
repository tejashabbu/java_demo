package July_23;
import java.util.*;

public class candyJar
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int S;
		JAR jar = new JAR(20,12,5);
		System.out.println("The JAR has "+jar.m+" candies left out of "+jar.n);
		int c=1;
		while(c==1)
		{
			System.out.println("Enter number of candies you want : ");
			S = sc.nextInt();
			jar.sell(S);
			System.out.println("To eat more candies press '1'");
			c = sc.nextInt();
		}
		sc.close();
	}
}
