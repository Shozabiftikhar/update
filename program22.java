package program22;

import java.util.Arrays;

public class program22 {

	public static void main(String[] args) {
		int[] arr = {1,4,3,2,5,8,7,9,10};
		 Arrays.sort(arr);
		 for (int i=1; i<=arr.length; i++ ) {
	            if (i!=arr[i-1]) {
	            	System.out.println("missing number is" + i);
	            	break;
	            }
	        }
		
		

	}

}
