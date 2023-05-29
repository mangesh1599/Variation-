package variation;

public class calculate_vowel_constatnts {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1="i m a good boy";

		String []s2=s1.split(" ");
		char ch=0;
		int cnt1=0;
		int cnt2=0;

		for(int i=0;i<s2.length;i++)
		{
			String s3=s2[i];
			for(int j=0;j<s3.length();j++)
			{
				ch=s3.charAt(j);

				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
				{
					cnt1++;

				}
				else
				{
					cnt2++;
				}
			}
		}
		System.out.println("\n"+"Vowel count : "+cnt1);
		System.out.println("\n"+"Consonant count : "+cnt2);

	}
}


Output-
	
Vowel count : 5
Consonant count : 5
