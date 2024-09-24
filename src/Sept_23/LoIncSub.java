package Sept_23;

import java.util.Arrays;

public class LoIncSub 
{
	public static int leng(int[] num)
	{
		if(num==null||num.length==0)
			return 0;
		int[] dp = new int[num.length];
		Arrays.fill(dp, 1);;
		int maxi = 1;
		for(int i=1;i<num.length;i++)
		{
			for(int j=0;j<i;j++)
				if(num[i]>num[j])
					dp[i] = Math.max(dp[i], dp[j]+1);
			maxi = Math.max(maxi, dp[i]);
		}
		return maxi;
	}
	public static void main(String[] args)
	{
		int[] arr = {10,9,2,5,3,7,101,18};
		System.out.println(leng(arr));
	}
}
