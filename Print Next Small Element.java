package variation;

import java.util.LinkedHashMap;

public class print_next_small_element {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[]a= {4,8,5,2,25};
		LinkedHashMap<Integer,Integer>map=new LinkedHashMap<Integer,Integer>();

		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					map.put(a[i],a[j]);
					cnt++;
					break;
				}
			}
			if(cnt==0)
			{	
				map.put(a[i], -1);
			}
		}
		System.out.println(map);
	}

}
