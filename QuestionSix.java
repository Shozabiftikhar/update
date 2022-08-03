package lab_praticeOne;
import java.util.*;
public class QuestionSix {
	
	
	public static void main(String[] args) {
		 char inputString[] = "geeksforgeeks".toCharArray();
	        int length = inputString.length;
	 
	        removeDuplicate(inputString, length);
s=geksfor
	}




	static void removeDuplicate(char inputString[], int length)
   {
  // Make the object of HashSet of size length-1
       HashSet<Character> listOfNonRepeating = new LinkedHashSet<>(length - 1);
     //Adding each character into  list of HashSet
       for (char charcter : inputString)
       {
             listOfNonRepeating.add(charcter);
       }

       // Print content of the set
       for (char i : listOfNonRepeating)
           {
            System.out.print(i);
            }
   }

}
