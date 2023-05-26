Efficient program to calculate e^x
he value of Exponential Function e^x can be expressed using following Taylor Series.

e^x = 1 + x/1! + x^2/2! + x^3/3! + ...... 
How to efficiently calculate the sum of above series? 
The series can be re-written as 
 

e^x = 1 + (x/1) (1 + (x/2) (1 + (x/3) (........) ) ) 
Let the sum needs to be calculated for n terms, we can calculate sum using following loop.

for (i = n - 1, sum = 1; i > 0; --i )
    sum = 1 + x * sum / i; 


------------------------------------------------------------------------------------------------------------


public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int n = 10;
		float x = 1;
		myCode(n,x);
	}
	//EndOfMainMethod
	private static void myCode(int n,float x)
	{
		short sum=0;
		for(int i=n-1;i>0;i--)
		{
			sum=1+x * sum / i;
		}
		System.out.println("e^x = "+sum);
	}
}


Output:
e^x = 2.7182815
