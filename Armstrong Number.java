package variation;

public class amrstrong_number {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num=370;
		int temp=num;
		int sum=0;
		while(temp>0)
		{
			int rem=temp%10;
			int cube=rem*rem*rem;
			sum=sum+cube;
			temp=temp/10;
		}

		if(sum==num)
		{
			System.out.println("amrstrong Number");

		}
		else
		{
			System.out.println("not amrstrong Number");
		}
	}

}
