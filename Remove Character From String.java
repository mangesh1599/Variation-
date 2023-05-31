package variation;

public class remove_charcater_from_string {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1="computer";
		String s2="cat";

		String s3="";
		if(s1.length()>s2.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				int cnt=0;
				for(int j=0;j<s2.length();j++)
				{
					if(s1.charAt(i)==s2.charAt(j))
					{
						cnt++;
					}
				}
				if(cnt==0)
				{
					s3=s3+s1.charAt(i);
				}
			}
			System.out.print(s3);
		}
		else
		{
			System.out.println(-1);
		}
	}
}



Output-
	ompuer
