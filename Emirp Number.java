package variation;

public class Emirpnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=31;
		int cnt=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				cnt++;
		}
		int n2=0;
		int cnt2=0;
		while(num>0)
		{
			int last=num%10;
			n2=n2*10+last;
			num/=10;
		}
		for(int i=2;i<n2;i++)
		{
			if(n2%i==0)
				cnt2++;
		}
		if(cnt==0 && cnt2==0)
			System.out.println("true");
		else
			System.out.println(false);

	}
}

Output-
	True
