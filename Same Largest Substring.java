package variation;

import java.util.ArrayList;

public class same_largest_substring {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1="GeeksforGeeks";
		String s2="GeeksQuiz";


		ArrayList<String>al1=new ArrayList<String>();
		findstring(s1,al1);

		ArrayList<String>al2=new ArrayList<String>();
		findstring(s2,al2);

		int maxlength=-1;
		String maxstr="";
		for(String data:al1)
		{
			if(al2.contains(data))
			{
				if(data.length()>maxlength)
				{
					maxlength=data.length();
					maxstr=data;
				}
			}
		}
		System.out.println(maxstr);	
	}

	private static void findstring(String s1, ArrayList<String> al) 
	{
		// TODO Auto-generated method stub

		for(int i=0;i<s1.length();i++)
		{

			for(int j=i;j<s1.length();j++)
			{
				String temp="";
				for(int k=i;k<j;k++)
				{

					temp=temp+s1.charAt(k);
				}
				al.add(temp);
			}

		}

	}

}
