package variation;

import java.util.TreeMap;

public class anagram_string {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String s1="geeksforgeeks";
		String s2="forgeeksgeeks";

		TreeMap<Character,Integer>tm1=new TreeMap<Character,Integer>();
		findfreq(s1,tm1);

		TreeMap<Character,Integer>tm2=new TreeMap<Character,Integer>();
		findfreq(s2,tm2);


		System.out.println(tm1);
		System.out.println(tm2);
		if(tm1.equals(tm2))
		{
			System.out.println("Anagram String ");
		}
		else
		{
			System.out.println("not Anagram String");
		}
	}

	private static void findfreq(String s1, TreeMap<Character, Integer> tm1) 
	{
		// TODO Auto-generated method stub

		for(int i=0;i<s1.length();i++)
		{
			if(tm1.containsKey(s1.charAt(i)))
			{
				int val=tm1.get(s1.charAt(i));
				val++;
				tm1.put(s1.charAt(i), val);
			}
			else
			{
				tm1.put(s1.charAt(i), 1);

			}
		}

	}

}




Output-
	{e=4, f=1, g=2, k=2, o=1, r=1, s=2}
	{e=4, f=1, g=2, k=2, o=1, r=1, s=2}
	Anagram String 
