package variation;

public class remainder_7 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s="12345";
		int num=0;
		int rem=0;
		for(int i=0;i<s.length();i++)
		{
			num=rem*10+(s.charAt(i)-48);		
			rem=num%7;
		}
		System.out.println(rem);

	}
}



Output-
	4

