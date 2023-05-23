package variation;

import java.util.ArrayList;

public class equal_to_sum_of_prime {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num=34;

		ArrayList<Integer>al=new ArrayList<Integer>();
		for(int i=2;i<=num;i++)
		{
			int tempnum=i;
			int cnt=0;
			for(int j=2;j<tempnum;j++)
			{
				if(tempnum%j==0)
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				al.add(tempnum);
			}
		}
		for(int i=0;i<al.size();i++)
		{
			for(int j=i;j<al.size();j++)
			{
				if(al.get(i)+al.get(j)==num)
				{
					System.out.println(al.get(i)+" "+al.get(j));
				}
			}
		}
	}
}
