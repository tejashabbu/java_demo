package July_25;

public class bitAnd
{
	public static void main(String[] args)
	{
		int l=4,r=7;
		AND(l,r);
//		System.out.println(3&4);
	}
	public static void AND(int l,int r) 
	{
		int ba=-1;
		for(int i=l;i<=r;i++)
		{
			ba&=i;
//			System.out.println(i);
//			System.out.println(ba);
//			System.out.println();
		}
		System.out.println("bitwise and of range ("+l+"-"+r+") is : "+ba);
	}
}
//0011
//0100
