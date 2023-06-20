Sum of the Series 1 + x/1 + x^2/2 + x^3/3 + .. + x^n/n
This is a mathematical series program where a user must enter the number of terms up to which the sum of the series is to be found. Following this, we also need the value of x, which forms the base of the series.
Examples : 
 

Input : base = 2, range = 5
Output : 18.07

Input : base = 1, range = 10
Output : 3.93




  
  public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int x = 2;
		int n = 5;
		myCode(x,n);
	}
	//EndOfMainMethod
	private static void myCode(int x,int n)
	{
		double sum=1.0;
		for(int i=1;i<=n;i++)
		{
			sum=(sum+Math.pow(x,i)/i);
		}
		System.out.printf("%.2f",sum);
	}
}


Output-18.07
