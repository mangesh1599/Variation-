package variation;

public class prime_palindrome {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num=20;
		for(int i=2;i<=num;i++)
		{
			int num2=i;

			boolean isprime=numprime(num2);
			if(isprime)
			{
				boolean ispalindrome=numpalindrome(num2);
				if(ispalindrome)
				{
					System.out.println(num2);
				}

			}

		}
	}
  
	private static boolean numpalindrome(int num2) 
	{
		int temp=num2;
		int revnum=0;
		while(temp>0)
		{
			int lastdigit=temp%10;
			revnum=revnum*10+lastdigit;
			temp=temp/10;
		}
		if(revnum==num2)
			return true;
		else
			return false;
	}

	private static boolean numprime(int num2) 
	{
		for(int i=2;i<num2;i++)
		{
			if(num2%i==0)
			{
				return false;
			}
		}
		return true;
	}
}


Output-
	2
        3
        5
	7
	11
