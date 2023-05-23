package variation;

import java.util.ArrayList;

public class prime_factor {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n=250;

		ArrayList<Integer>al=new ArrayList<Integer>();
		while(n>1)
		{
			int i=2;
			while(i<=n)
			{
				if(n%i==0)
				{
					al.add(i);
					n=n/i;
					break;
				}
				i++;
			}
		}
		System.out.println(al);
	}
}
