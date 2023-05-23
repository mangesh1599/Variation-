package variation;

public class swape_two_string_without_using_third_variable {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s1="good";
		String s2="morning";

		s1=s1+s2;


		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length(),s1.length());

		System.out.println(s1);
		System.out.println(s2);


		//method-2

		/*s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length());


		System.out.println("\n"+s1);
		System.out.println(s2);
		 */

	}

}
