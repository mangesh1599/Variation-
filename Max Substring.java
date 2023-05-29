package variation;

public class max_substring {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s="11100011110001";
		int max=Integer.MIN_VALUE;

		String []s2=s.split("0");
		for(int i=0;i<s2.length;i++)
		{
			if(s2[i].length()>max)
			{
				max=s2[i].length();
			}
		}
		System.out.println(max);
	}
}


Output-
	4
