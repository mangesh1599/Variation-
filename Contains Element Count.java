package variation;

public class contains4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int element=4;
		int cnt=0;
		for(int i=1;i<=500;i++)
		{
			int num=i;
			while(num>0)
			{
				int digit=num%10;
				if(digit==element)
				{
					cnt++;
					break;
				}

				num=num/10;
			}
		}
		System.out.println("Count of 4 : "+cnt);
	}

}
