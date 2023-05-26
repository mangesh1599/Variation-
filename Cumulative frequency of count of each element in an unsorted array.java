Given an array of elements. The task is to calculate the cumulative frequency of each element of the array.

Input : Arr[] = {1, 2, 2, 1, 3, 4}
Output : 2 4 5 6
Explanation:
Here we have an array arr[] = [1, 3, 2, 
                               1, 2, 4]
Output :1->2
        2->4
        3->5
        4->6
So, the return array will have [2, 4, 5, 6] 
as an output.
  
  
  
  
  
 
 import java.util.*;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			1, 2, 2, 1, 3, 4
		}
		;
		int n=a.length;
		myCode(a,n);	
	}
	//EndOfMainMethod
	public static void myCode(int[] a,int n) 
	{
		// write code here
		ArrayList <Integer>al=new ArrayList<Integer>();
		int index=0;
		int b[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			b[index++]=a[i];
		}
		int freq = 0;
		for(int i = 0; i < n; i++)
		{
			freq += b[a[i]];
			if(b[a[i]] != 0)
			{
				al.add(freq);
			}
			b[a[i]] = 0;
		}
		System.out.println(al);
	}
}
