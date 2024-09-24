package Sept_23;

public class LoComSub
{
	public static int leng(String s1,String s2)
	{
		int m = s1.length();
		int n = s2.length();
		int[][] dp = new int[m+1][n+1];
		for(int i=1;i<=m;i++)
			for(int j=1;j<=n;j++)
			{
				if(s1.charAt(i-1)==s2.charAt(j-1))
					dp[i][j] = dp[i-1][j-1]+1;
				else
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
			}
		return dp[m][n];
	}
	public static void main(String[] args)
	{
		String a = "abcde",b = "ace";
		System.out.println(leng(a,b));
	}
}
