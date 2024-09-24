package July_25;

public class revBit
{
	public static void main(String[] args)
	{
		String s = "000101101100";
		String rev = "";
		for (int i=0; i<s.length(); i++)
	      {
	        char ch= s.charAt(i); //extracts each character
	        rev= ch+rev; //adds each character in front of the existing string
	      }
		System.out.println(rev);
		int num = Integer.parseInt(rev,2);
		System.out.println(num);
	}
}
