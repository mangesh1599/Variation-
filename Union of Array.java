package variation;

import java.util.ArrayList;

public class UnioninArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {2,3,4,7,1};
		int[] b= {4,1,9,3,5};

		ArrayList<Integer> al=new ArrayList<>();

		for(int i=0;i<a.length;i++)
		{
			al.add(a[i]);
		}
		for(int i=0;i<b.length;i++)
		{
			int cnt=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==b[i])
					cnt++;
			}
			if(cnt==0)
				al.add(b[i]);
		}
		System.out.println(al);

	}
}
