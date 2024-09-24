package Sept_19;

public class stock_sell
{
	public static void main(String[] args) 
	{
		int[] prices = {7,1,5,3,6,4};
		int max=0,prof=0,i1=-1,i2=-1;
		for(int i=0;i<prices.length;i++)
		{
			for(int j=i+1;j<prices.length;j++)
			{
				prof = prices[j]-prices[i];
				if(prof>max)
				{
					max = prof;
					i1 = i;i2 = j;
				}
			}
		}
		System.out.println("Buy on day-"+(i1+1)+" and Sell on day-"+(i2+1)+" to get the max-profit of '"+max+"'");
	}
}
