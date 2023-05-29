package variation;

public class alternative_sorting {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]= {7,1,2,3,4,5,6,8};

		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])

				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int b[]=new int[a.length];
		int index=0;

		int i=0;
		int j=a.length-1;

		while(i<=j)
		{

			b[index++]=a[j];
			b[index++]=a[i];

			i++;
			j--;
		}
		for(int k=0;k<b.length;k++)
		{
			System.out.print(b[k]+" ");
		}
	}

}




Output-
	8 1 7 2 6 3 5 4 
