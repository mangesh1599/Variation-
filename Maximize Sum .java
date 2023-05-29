package variation;

import java.util.Arrays;

public class maximize_sum {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int []a= {1,4,3};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i]*i;

		}
		System.out.println(sum);

	}

}


Output-
	10
