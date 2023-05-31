package variation;

import java.util.Arrays;

public class small_large {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int []a= {2,4,3,1,5,8,9,6,7};
		Arrays.sort(a);

		int []b=new int[a.length];
		int i=0;
		int j=a.length-1;
		int index=0;
		while(i<j)
		{
			b[index++]=a[i];
			b[index++]=a[j];

			i++;
			j--;
		}
		if(i==j)
		{
			b[index]=a[i];
		}
		for(int data:b)
		{
			System.out.print(data+" ");
		}
	}
}


Output-
	1 9 2 8 3 7 4 6 5 
