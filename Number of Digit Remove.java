package variation;

public class number_of_digit_to_remove {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String s="11";
		int sum=0;
		if(s.length()==1)
		{
			System.out.println(-1);
		}
		if(s.length()==2)
		{
			System.out.println(-1);
		}
		else
		{
			for(int i=0;i<s.length();i++)
			{
				sum=sum+(int)s.charAt(i);
			}
			for(int i=0;i<s.length();i++)
			{
				if(sum%3==(s.charAt(i)-48)%3)
				{
					System.out.println(1);
					break;
				}
				else
				{
					System.out.println(-1);
					break;
				}
			}

		}
	}
}



Output-
	-1
