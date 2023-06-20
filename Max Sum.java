Given an array a[ ] of N elements. Consider array as a circular array i.e. element after an is a1. The task is to find maximum sum of the absolute difference between consecutive elements with rearrangement of array elements allowed i.e. after any rearrangement of array elements find |a1 – a2| + |a2 – a3| + …… + |an-1 – an| + |an – a1|.

Example 1:

Input:
N = 4
a[] = {4, 2, 1, 8}
Output: 
18
Explanation: Rearrangement done is {1, 8, 
2, 4}. Sum of absolute difference between 
consecutive elements after rearrangement = 
|1 - 8| + |8 - 2| + |2 - 4| + |4 - 1| = 
7 + 6 + 2 + 3 = 18.
  
  
  
  
  import java.util.*;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int	a[] = 
		{
			4, 2, 1, 8
		}
		;
		int n =a.length;
		myCode(a,n);
	}
	//EndOfMainMethod
	public static void myCode(int a[], int n) 
	{
		Arrays.sort(a);
		int sum=0;
		for (int i = 0; i < a.length/2; i++)
		{
			sum -= (2 * a[i]);
			sum += (2 * a[n - i - 1]);
		}
		System.out.println(sum);
	}
}


Output-18
  
