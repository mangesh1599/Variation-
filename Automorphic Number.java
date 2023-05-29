package variation;

public class automorphic_number {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num=5;

		int sqrt=num*num;

		String s1=Integer.toString(sqrt);
		String s2=Integer.toString(num);


		System.out.println(s1.endsWith(s2));

	}

}

Output-
	True
