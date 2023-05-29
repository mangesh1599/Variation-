package variation;

import java.util.ArrayList;

public class intersection_of_multiple_arrays {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]= {2,3,4,7,1};
		int b[]= {4,1,9,3,5};

		int cnt=0;
		for(int i=0;i<a.length;i++)
		{

			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					cnt++;
					System.out.println(a[i]);
					break;
				}
			}
		}
		if(cnt==0)
		{
			//continue;
			System.out.println("no intersection");


		}
    
  }
  
-----------------------------------------------------------------------------------------------------------------------
    
    Method -2
  
  
  package variation;

import java.util.ArrayList;

public class intersection_of_multiple_arrays {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]= {2,3,4,7,1};
		int b[]= {4,1,9,3,5};
 

				ArrayList<Integer>al1=new ArrayList<Integer>();
				ArrayList<Integer>al2=new ArrayList<Integer>();
		
				for(int data:a)
					al1.add(data);
		
		
				for(int data:b)
					al2.add(data);
		
				ArrayList<Integer>al3=new ArrayList<Integer>();
		
				for(int i=0;i<al1.size();i++)
				{
					for(int j=0;j<al2.size();j++)
					{
						if(al1.get(i)==al2.get(j))
						{
							al3.add(al1.get(i));
							al1.remove(i);
							al2.remove(j);
							i--;
							break;
						}
					}
				}
				System.out.println(al3);


	}

}
	
	


Output-
	3
	4
	1
