package variation;

public class array_Except {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int []a= {77,80,-17,19,20};
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0 || a[i]==-1)
			{
				cnt++;

			}
		}
		if(cnt==0)
		{
			System.out.println(true);

		}
		else
		{
			System.out.println(false);

		}
	}

}


Output-
	True
