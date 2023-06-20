We can find the second smallest number in an array in java by sorting the array and returning the 2nd element. 
Input:int a[]={1,2,5,6,3,2};  
Output:2
  
  
  
  public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int a[]=
		{
			1,2,5,6,3,2
		}
		;  
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(int[] a)
	{
		int min=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min2 && a[i]!=min)
			{
				min2=a[i];
			}
		}
		System.out.println(min2);
	}
}


Output-2
