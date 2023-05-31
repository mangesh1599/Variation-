package variation;

import java.util.ArrayList;
import java.util.TreeSet;

public class print_unique_character_in_string {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String a="geeksforgeeks";
		String b="geeksquiz";

		String s3="";
		TreeSet<Character>ts=new TreeSet<Character>();
		for(int i=0;i<a.length();i++) 
		{
			if(!b.contains(a.charAt(i)+""))
			{
				ts.add(a.charAt(i));
			}
		}
		for(int i=0;i<b.length();i++) 
		{
			if(!a.contains(b.charAt(i)+""))
			{
				ts.add(b.charAt(i));
			}
		}
		System.out.println(ts);
	}
}


Output-
	[f, i, o, q, r, u, z]

