package variation;

public class equiilibrium {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int []a={1,2,0,3};
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			int leftsum=0;
			for(int j=0;j<i;j++)
			{
				leftsum=leftsum+a[i];

			}
			int rightsum=0;
			for(int j=i+1;j<a.length;j++)
			{
				rightsum=rightsum+a[i];

			}
			if(leftsum==rightsum)
			{
				cnt++;
				System.out.println(i);
				break;	
			}
		}
		if(cnt==0)
		{
			System.out.println(-1);
		}

	}
}


Output-
	2
