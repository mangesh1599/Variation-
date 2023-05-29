package variation;

import java.util.TreeMap;

public class find_max_repeated_ele {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int a[]= {2,1,2,1,1};

		int min=Integer.MAX_VALUE;
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{

				if(a[i]==a[j])
				{
					cnt++;
				}
			}
			int cnt1=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt1++;
				}
			}
			if(cnt==0)
			{

				if(a[i]>max)
				{
					if(a[i]<min)
					{
						min=a[i];
					}
				}
			}
		}
		System.out.println(min);


    
    
    Method - 2

				TreeMap<Integer,Integer>hm=new TreeMap<Integer,Integer>();
				for(int ele:a)
				{
					if(hm.containsKey(ele))
					{
						int val=hm.get(ele);
								val++;
						hm.put(ele, val);
					}
					else
					{
						hm.put(ele, 1);
					}
				}
				int max=Integer.MIN_VALUE;
				int mainkey=-1;
				for(int key:hm.keySet())
				{
					if(hm.get(key)>max)
					{
						max=hm.get(key);
						mainkey=key;
					}
				}
				System.out.println(mainkey);

	}

}



Output-
	1
