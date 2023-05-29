package variation;

public class Fullprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=37;

		boolean givenprime=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				givenprime=false;
		}
		boolean digitprime=true;
		if(givenprime)
		{
			while(num>0)
			{
				int last=num%10;
				for(int i=2;i<last;i++)
				{
					if(last%i==0)
						digitprime=false;
				}
				if(digitprime)
				{
					num/=10;
				}
				else
					break;
			}
		}

		else
			System.out.println(0);
		if(digitprime)
			System.out.println(0);
		else
			System.out.println(1);
	}	
}


Output-
	0


