package July_26;

public class pascal2 
{
	public static void main(String[] args)
	{
		int ri = 3,line=ri+1;
         // used to represent C(line, i)
			int C = 1;
			for (int i = 1; i <= line; i++)
			{

             // The first value in a line is always 1
				System.out.print(C + " ");
				C = C * (line - i) / i;
			}
			System.out.println();
	}
}
