One line function for factorial of a number
Factorial of a non-negative integer, is multiplication of all integers smaller than or equal to n. 

Example :

Factorial of 6 is 6 * 5 * 4 * 3 * 2 * 1 which is 720.



public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int num = 5;
		myCode(num);
	}
	//EndOfMainMethod
	private static void myCode(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of 5 is "+fact);
	}
}


Output-120
