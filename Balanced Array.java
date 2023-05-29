package variation;

public class balanced_array {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int a[]= {1,5,3,2};

		int leftsum=0;
		int rightsum=0;
		int mid=a.length/2;

		int min=Integer.MAX_VALUE;

		for(int i=0;i<mid;i++)
		{
			leftsum=leftsum+a[i];
		}
		for(int j=mid;j<a.length;j++)
		{
			rightsum=rightsum+a[j];
		}
		int diff=Math.abs(rightsum-leftsum);
		System.out.println(diff);
	}
}


Output-
	1
