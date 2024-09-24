package July_26;

public class remEle
{
	public static void main(String[] args)
	{
		int c=0,val=5;
		int[] ar = {2,3,4,4,5,5,5,6,6,7};
		for(int i=0;i<ar.length-1-c;i++)
		{
			if(ar[i]==val)
			{
				remove(ar,i);
				c++;
			}
		}
		for(int i=0;i<ar.length-1-c;i++)
		{
			if(ar[i]==val)
			{
				remove(ar,i);
				c++;
			}
		}
		for(int i=0;i<ar.length-c;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
	public static void remove(int[] a,int i)
	{
		for(int j=i;j<a.length-1;j++)
		{
			a[j]=a[j+1];
		}
//		a[a.length-1]=-1;
	}
}
//123456789098765432123456789009876543211234567890987654321123456789