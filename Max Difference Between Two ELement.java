package variation;

public class max_distence_betn_two_ele {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]= {3,2,1,2,1,4,5,8,6,7,4,2};

		int max=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] && max<j-i)
				{
					max=j-i;
				}
			}
		}
		System.out.println(max);
	}
}


Output-
	10
