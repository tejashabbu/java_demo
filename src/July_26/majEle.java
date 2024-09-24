package July_26;

//import java.util.ArrayList;
//import java.util.List;

public class majEle
{
	public static void main(String[] args)
	{
		int[] ar = {3,1,1,3,3};
//		List<Integer> r = new ArrayList<Integer>();
		int n=ar.length,m=n/2,max=-1;
//		r.add(ar[0]);
		
		for(int i=0;i<n;i++)
		{
//			System.out.println("ar[i] : "+ar[i]);
			if(i==0)
			{
				int count=0;
				for(int j=0;j<n;j++)
				{
					if(ar[i]==ar[j])
						count++;
				}
//				r.add(ar[i]);
//				c++;
				if(count>m)
				{
					max=ar[i];
				}
			}
//			for(int k=0;k<r.size();k++)
//			{
////				System.out.println("R fuck : "+r.get(k));
//				if(r.get(k)==ar[i])
//				{
////					System.out.println("ar[i] : "+ar[i]);
//					System.out.println("r.k : "+r.get(k));
//				}
//				else
//				{
//					int count=0;
//					for(int j=0;j<n;j++)
//					{
//						if(ar[i]==ar[j])
//							count++;
//					}
//					r.add(ar[i]);
////					System.out.println(r);
////					c++;
//					if(count>m)
//					{
//						max=ar[i];
//					}
//				}
//			}
//			for(int k=0;k<c;k++)
//			{
//				if(r.get(k)!=ar[i])
//				{
////					c1++;
//					int count=0;
//					for(int j=0;j<n;j++)
//					{
//						if(ar[i]==ar[j])
//							count++;
//					}
////					r.add(ar[i]);
////					c++;
//					if(count>m)
//					{
//						max=ar[i];
//					}
//				}
//			}
			
				
		}
//		r.add(2);
//		for(int k=0;k<r.size();k++)
//		{
//			System.out.print(r.get(k)+" ");
//		}
//		System.out.println(r);
//		System.out.println(c1);
		if(max==-1)
		{
			System.out.println("Major element doesn't exist!");
		}
		else
		{
			System.out.println("Major element = "+ max);
		}
	}
}
