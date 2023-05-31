package variation;

public class sum_of_factorial {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num=145;
		int sum=0;
		int temp=num;
		int fact=1;
		while(num>0)

		{
			int rem=num%10;
			int myfact=factorial(rem);
			sum=sum+myfact;
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("Strong");
		}
		else
		{
			System.out.println("Weak");
		}

	}
	private static int factorial(int rem) 
	{
		int fact=1;

		for(int i=1;i<=rem;i++)
		{
			fact=fact*i;

		}
		return fact;
	}
}



Output-
	StrongS
