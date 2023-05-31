package variation;

public class sum_equal_perfect_square {


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n=12;
		int i=1;
		int sum=0;
		boolean b = false;
		while(i<=n)
		{
			sum=sum+i;
			i=i+2;
			if(sum==n)
			{
				b=true;
			}
		}
		if(b==true)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}

}



Output-
	NO

