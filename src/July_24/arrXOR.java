package July_24;

public class arrXOR
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer();
		int[] ar = {10,11,1,2,3};
		int N = ar.length;
		int[] arr = new int[ar.length];
//		System.out.println(Integer.toBinaryString(10));
//		String bin = "1010";
//		System.out.println(Integer.parseInt(bin,2));
		for(int i=0;i<N-1;i++)
		{
			sb.delete(0,sb.length());
			String a,b,c;
			a = dectb(ar[i]);
			b = dectb(ar[i+1]);
//			System.out.println(a+" "+b);
			char o='1',z='0';
			for(int j=0;j<a.length();j++)
			{
//				System.out.println(a.charAt(j)+b.charAt(j));
				if(Character.compare(a.charAt(j),b.charAt(j))==0)
				{
					sb.insert(j,z);
				}
				else
				{
					sb.insert(j,o);
				}
//				System.out.println(sb);
			}
//			System.out.println(sb);
//			arr[i] = 
			c = sb.toString();
			arr[i] = Integer.parseInt(c,2);
//			System.out.println(arr[i]);
		}
		arr[N-1] = ar[N-1];
		System.out.print("XoR array : {");
		for (int i = 0; i < N-1; i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.print(arr[N-1]+"}");
		
	}
	public static String dectb(int decimal) {
	    String binary = Integer.toBinaryString(decimal); // Convert to binary

	    // Ensure the result is 4 bits long
	    if (binary.length() < 4) {
	        binary = String.format("%4s", binary).replace(' ', '0'); // Pad with zeros
	    } else if (binary.length() > 4) {
	        binary = binary.substring(binary.length() - 4); // Take the last 4 bits
	    }

	    return binary;
	}
}
