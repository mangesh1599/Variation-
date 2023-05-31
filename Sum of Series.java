package variation;

public class sum_of_series {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n=5;
		int a=1;
		int sum=1;
		for(int i=2;i<=n;i++)
		{
			a=a+i;
			sum=sum+a;

		}
		System.out.println("sum : "+sum);

	}

}



Output-
	sum : 35
