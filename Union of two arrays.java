Given two arrays a[] and b[] of size n and m respectively. The task is to find union between these two arrays.

Input:
a[] ={1,4,7}
b[] = {2,3,5,6,8}

Output: c[] = {1,2,3,4,5,6,7,8}Count: 8
  
  
  
  
  
  import java.util.*;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a = 
		{
			1,4,5
		}
		;
		int[] b = 
		{
			2,3,6,7
		}
		;
		myCode(a,b);
	}
	//EndOfMainMethod
	public static void myCode(int[] a,int[]b) 
	{
		int []c=new int [a.length+b.length];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			c[index++]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[index++]=b[i];
		}
		Arrays.sort(c);
		for(int data:c)
		{
			System.out.print(data+" ");
		}
		System.out.println("\n"+"Count: "+c.length);
	}
}


  
