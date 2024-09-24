package July_25;

public class hamDist
{
	public static void main(String[] args)
	{
//		int a = hamming(4,14);
//		System.out.println(a);
		int[] ar = {4,14,2};
//		int[] ar = {4,14,4};
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				sum += hamming(ar[i],ar[j]);
			}
		}
		System.out.println(sum);
	}
	public static int hamming(int a,int b)
	{
		int dist = 0;
		String sa = Integer.toBinaryString(a);
		String sb = Integer.toBinaryString(b);
		if(sa.length()>sb.length())
		{
			int p=sa.length()-sb.length();
			for(int i=0;i<p;i++)
			{
				sb = '0'+sb;
			}
		}
		if(sa.length()<sb.length())
		{
			int p=sb.length()-sa.length();
			for(int i=0;i<p;i++)
			{
				sa = '0'+sa;
			}
		}
		for(int i=0;i<sa.length();i++)
		{
			if(sa.charAt(i)!=sb.charAt(i))
				dist++;
		}
		return dist;
	}
}
