package variation;

public class swipe_k_ele {

	public static void main(String[] args) {
		int[] arr = {5,1,4,3,2};
		for (int data: arr) {
			System.out.print(data+" ");
		}

		int temp = arr[1];
		arr[1] = arr[3];
		arr[3] = temp;
		System.out.println();
		for (int data: arr) {
			System.out.print(data+" ");
		}

	}

}



Output-
	Before Swipe-5 1 4 3 2 
	After Swipe-5 3 4 1 2 
