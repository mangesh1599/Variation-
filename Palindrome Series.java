package variation;

public class palindrome_series {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int number=500;
		int sum=0;
		int cnt=0;
		for(int i=1;i<=number;i++)
		{
			int num=i;
			while(num>0)
			{
				int rev=num%10;
				sum=sum*10+rev;
				num=num/10;
			}
			if(sum==i)
			{
				cnt++;
				System.out.println(i);
			}
			else
				sum=0;
		}
		System.out.println("count of numbers : "+cnt);

	}

}
