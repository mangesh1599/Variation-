package variation;

import java.util.ArrayList;

public class find_samallest_subarray_its_sum_greater_than_value {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]= {1,10,5,2,7};
		int x=9;

		ArrayList<Integer>mainal=null;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{

				ArrayList<Integer>al=new ArrayList<Integer>();
				int sum=0;
				for(int k=i;k<=j;k++)
				{
					al.add(a[k]);
					sum=sum+a[k];

				}
				if(sum>x)
				{
					if(al.size()<min)
					{
						min=al.size();
						mainal=al;
					}
				}
			}
		}
		System.out.println(min);
		System.out.println(mainal);

	}

}
