package variation;

public class munchhausen_number {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num=3435;
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			int temp=i;
			while(temp>0)
			{
				int rem=temp%10;
				sum+=(int)Math.pow(rem, rem);

				temp=temp/10;
			}
			if(sum==i)
			{
				System.out.println(i);
			}
		}

	}

}
