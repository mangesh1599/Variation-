Find difference between sum of diagonals 
Given a matrix Grid[][] of size NxN. Calculate the absolute difference between the sums of its diagonals.
Input:
N=3
Grid=[[1,2,3],[4,5,6],[7,8,9]]
Output: 
0



public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int N=3;
		int	Grid[][]= 
		{
			{
				1,2,3
			}
			,
			{
				4,5,6
			}
			,
			{
				7,8,9
			}
		}
		;
		myCode(N,Grid);
	}
	//EndOfMainMethod
	public static void myCode(int N, int[][] Grid) 
	{
		int d1=0;
		int d2=0;
		for(int i=0;i<N;i++)
		{
			
				d1+=Grid[i][i];
				d2+=Grid[i][N-i-1];
			
		}
		System.out.println(d2-d1);
	}
}
