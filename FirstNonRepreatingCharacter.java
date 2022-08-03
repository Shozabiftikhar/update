import java.util.Scanner;

public class FirstNonRepreatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner obj2 = new Scanner(System.in);
	      System.out.println("Enter string input");
	      String userStr= obj2.next();
	      for(char i:userStr.toCharArray()) // converts the string to a char array
	      {
	    	  if(userStr.indexOf(i)==userStr.lastIndexOf(i))
	    	  {
	    		  System.out.println("First Non Repeating Character is " + i);
	    		  break;
	    	  }
	      }
	}

}
