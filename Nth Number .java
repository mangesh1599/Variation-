package variation;

public class nth_number{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n=10;
		int i=1;
		int cnt=0;
		while(true)
		{
			int num=i;
			while(num>0)
			{
				int digit=num%10;
				if(digit==3 || digit==4)
				{
					num=num/10;
				}
				else
				{
					break;
				}
			}
			if(num==0)
			{
				cnt++;
				System.out.println(i);
			}
			if(cnt==n)
			{
				break;
			}
			i++;
		}
	}
}



Output-
	43
	44
	333
	334
	343
	344


