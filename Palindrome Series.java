package variation;

public class palindrome_series {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int number=500;
		int sum=0;
		int cnt=0;
		for(int i=1;i<=number;i++)
		{
			int num=i;
			while(num>0)
			{
				int rev=num%10;
				sum=sum*10+rev;
				num=num/10;
			}
			if(sum==i)
			{
				cnt++;
				System.out.println(i);
			}
			else
				sum=0;
		}
		System.out.println("count of numbers : "+cnt);

	}

}




Output-
	
	1
3
5
7
9
11
22
33
44
55
66
77
88
99
101
111
121
131
141
151
161
171
181
191
202
212
222
232
242
252
262
272
282
292
303
313
323
333
343
353
363
373
383
393
404
414
424
434
444
454
464
474
484
494
count of numbers : 54

