package variation;

public class shift_all_zero_last {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]= {0,2,4,6,0,2,-3,0,0};
		int []b =new int [a.length];
		int ind=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				b[ind++]=a[i];
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==0)
				b[ind++]=a[i];
		}
		for (int i = 0; i < b.length; i++) 
		{
			System.out.print(b[i]+" ");
		}
	}

}


Output-
	2 4 6 2 -3 0 0 0 0 
