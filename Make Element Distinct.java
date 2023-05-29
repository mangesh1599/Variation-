package variation;

public class make_ele_distinct {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[]= {2,2,2,3,5,6};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					a[i]=a[i]+1;
				}
			}
			//System.out.print(a[i]+" ");
			sum=sum+a[i];
		}
		System.out.println(sum);


	}

}


Output-
	27
