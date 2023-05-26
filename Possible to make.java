Possible to make a divisible by 3 number using all digits in an array
Given an array of integers, the task is to find whether it’s possible to construct an integer 
using all the digits of these numbers such that it would be divisible by 3. If it is possible then print “Yes” and if not print “No”. 
Examples: 
 

Input : arr[] = {40, 50, 90}
Output : Yes
We can construct a number which is
divisible by 3, for example 945000. 
So the answer is Yes. 

Input : arr[] = {1, 4}
Output : No
The only possible numbers are 14 and 41,
but both of them are not divisible by 3, 
so the answer is No.
  
  
  
  public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int arr[] = 
		{
			40, 50, 90 
		}
		;
		myCode(arr);
	}
	//EndOfMainMethod
	private static void myCode(int []arr)
	{
		int a=0;
		for(int i=0;i<arr.length;i++)
		{
			a=a+arr[i];
		}
		
		if(a%3==0)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}
