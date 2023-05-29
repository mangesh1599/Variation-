package variation;

public class difference_betn_sums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1212112;
		String s1="";
		String s2="";
		String s=Integer.toString(a);
		for(int i=0;i<s.length();i+=2)
		{
			s1=s1+s.charAt(i);
		}
		for(int i=1;i<s.length();i+=2)
		{
			s2=s2+s.charAt(i);
		}
		int m1=Integer.parseInt(s1);
		int m2=Integer.parseInt(s2);

		int sum1=0;
		int sum2=0;

		while(m1>0)
		{
			int rem=m1%10;
			sum1=sum1+rem;
			m1=m1/10;

		}
		while(m2>0)
		{
			int rem2=m2%10;
			sum2=sum2+rem2;
			m2=m2/10;
		}
		if(sum1==sum2)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}

}


Output-
	Yes
