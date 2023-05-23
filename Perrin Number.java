package variation;

public class perrin_number {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n=9;
		System.out.println(isperin(n));

	}
	private static int isperin(int n)
	{
		// TODO Auto-generated method stub
		if(n==0)
		{
			return 3;
		}
		else if(n==1)
		{
			return 0;
		}
		else if(n==2)
		{
			return 2;
		}
		else
		{
			return isperin(n-2)+isperin(n-3);
		}

	}

}


