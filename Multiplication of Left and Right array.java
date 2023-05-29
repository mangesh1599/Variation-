package variation;

public class multiplication_of_left_and_right_array {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]= {1,4,6,8};

		int mid=a.length/2;

		int leftsum=0;
		for(int i=0;i<mid;i++)
		{
			leftsum+=a[i];
		}

		int rightsum=0;
		for(int i=mid;i<a.length;i++)
		{
			rightsum+=a[i];
		}
		System.out.println(leftsum*rightsum);
	}

}



Output-
	70
