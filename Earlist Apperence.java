package variation;

import java.util.ArrayList;

public class apperance_is_earlist {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int arr[]= {10,30,20,10,20};

		ArrayList<Integer>al=new ArrayList <Integer>();
		for(int data:arr)
		{
			al.add(data);
		}
		int min=Integer.MAX_VALUE;
		int ele=0;
		for(int i=0;i<al.size();i++)
		{
			int lastindex=al.lastIndexOf(al.get(i));
			if(lastindex<min)
			{
				min=lastindex;
				ele=al.get(i);
			}
		}
		System.out.println(ele);
	}

}
