package variation;

public class print_duplicate {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]= {1,2,2,2,2,10,20,30};

		int i=0;
		int b=a.length;
		while(b>0)
		{

			if(a[i]==a[i+1])
			{
				System.out.println(a[i]);
				break;
			}
			i++;

		}

	}

}
