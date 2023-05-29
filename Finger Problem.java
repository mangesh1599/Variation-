package variation;

public class finger_prbm {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n=20;

		int finger=n%8;

		if(finger==1)
			System.out.println("thumb finger");

		if(finger==0 || finger==2)
			System.out.println("index finger");

		if(finger==3 || finger==7)
			System.out.println("middle finger");

		if(finger==4 || finger==6)
			System.out.println("ring finger");

		if(finger==5)
			System.out.println("little finger");


	}

}




Output-
	ring finger
