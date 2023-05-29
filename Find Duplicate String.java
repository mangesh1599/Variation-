package variation;

public class find_duplicate_string {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stuab
		String s1="Big black bug bit a big black dog on his big black noise";


		String[] s2=s1.split(" ");

		String s3="";
		for(int i=0;i<s2.length;i++)
		{
			int cnt=0;
			for(int j=i+1;j<s2.length;j++)
			{
				if(s2[i].equals(s2[j]))
				{
					cnt++;

				}

			}
			if(cnt==1)

				System.out.print(s2[i]+" ");

		}
	}

}


Output-
	big black 
