package variation;

public class max_sum_of_circular_subarray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int []a= {8,-8,9,-9,10,-11,12};

		int mainmax=0;
		for(int m=0;m<a.length;m++)

		{
			int max=0;
			for(int i=0;i<a.length;i++)
			{
				for(int j=i;j<a.length;j++)
				{
					int sum=0;
					for(int k=i;k<=j;k++)
					{
						sum=sum+a[k];
					}
					if(sum>max)
					{
						max=sum;
					}
				}
			}
			if(max>mainmax)
			{
				mainmax=max;
			}

			int temp=a[a.length-1];
			for(int i=a.length-1;i>0;i--)
			{
				a[i]=a[i-1];
			}
			a[0]=temp;
		}
		System.out.println(mainmax);

	}

}



Output-
	22
