package variation;

public class conversion_of_character {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1="VauN";
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
			{
				char ch=(char)(219-s1.charAt(i));
				s2=s2+ch;
			}
			else
			{
				char ch=(char)(155-s1.charAt(i));
				s2=s2+ch;
			}
		}
		System.out.println(s2);

	}

}


Output-
	EzfM
