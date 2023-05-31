package variation;

public class pair_product_equal_given_value {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]= {10,20,9,40};

		int k=400;
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]*a[j]==k)
				{
					cnt++;
				}
			}
		}
		if(cnt==0)
		{
			System.out.println("no");
		}
		else
		{
			System.out.println("yes");
		}

	}

}



Output-
	yes
