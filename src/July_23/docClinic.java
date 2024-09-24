package July_23;

public class docClinic
{
	public static void main(String[] args)
	{
		int[] pati = {10,20,30,50,40,3,7,12};
		int Total = 0;
		int[] pat = new int[20];
		if(pati.length>20)
		{
			for(int i=0;i<20;i++)
			{
				pat[i] = pati[i];
			}
		}
		else
		{
			pat = pati;
		}
		for(int i=0;i<pat.length;i++)
		{
//			if(patients[i])
//			{
//				break;
//			}
			if(pat[i]<=17)
			{
				Total += 200;
			}
			else if(pat[i]>17 && pat[i]<=40)
			{
				Total += 400;
			}
			else if(pat[i]>40 && pat[i]<=120)
			{
				Total += 300;
			}
			else
			{
				System.out.println("Enter valid age! (0-120)");
				break;
			}
		}
		System.out.println("Total fees for the day is : "+Total);
	}
}
