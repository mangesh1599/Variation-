package variation;

public class sum_of_subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,2,-2,-20,10,-10};

		int sum=-10;

		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			int sum1=0;
			for(int j=i;j<a.length;j++)
			{
				sum1=sum1+a[j];
				if(sum==sum1)
				{
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
