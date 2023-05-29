package variation;

public class string_with_num_with_its_end {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		String s="geeks5";
		String s2="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				s2=ch+s2;
			}
			else
			{
				break;
			}
			int num=Integer.parseInt(s2);
			if(s.length()-s2.length()==num)
			{
				System.out.println(1);	
			}
			else
			{
				System.out.println(0);
			}


		}

	}

}

Output-
	Count of 4 : 176
