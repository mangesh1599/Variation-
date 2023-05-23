package variation;

public class convert_0_to_5 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num=20010;
		int rem;
		int sum=0;
		while(num>0)
		{
			rem=num%10;
			if(rem==0)
			{
				rem=5;
			}
			sum=sum*10+rem;
			num=num/10;
		}
		int sum2=0;
		while(sum>0)
		{
			int rem2=sum%10;
			sum2=sum2*10+rem2;
			sum=sum/10;
		}
		System.out.println(sum2);
	}
}
