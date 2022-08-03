package Lab1;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		String input = "forgeeksskeegfor";
		
		Scanner myObj = new Scanner(System.in);
	    System.out.println("Input string: ");

	    String inputString = myObj.nextLine();
	    
	    String palindrome = "";
		
	    palindrome = getPalindrome(inputString);
		
		if(palindrome.length() > 1) {
			System.out.println("Palindrome is '" + palindrome + "'");
		}
		else {
			System.out.println("Palindrome does not exist.");
		}
	}
	
	public static String getPalindrome(String inputString) {
		double length = inputString.length();
		int isEvenLength = (int)Math.ceil(length) % 2;
		
		int midIndex = inputString.length()/2;
		
		String palindrome = "";
		if(isEvenLength == 1) {
			palindrome = inputString.charAt(midIndex) + "";
		}
		
		for(int i = 0; i < midIndex; i++ ) {
			char a = inputString.charAt(midIndex - i - 1);
			char b = inputString.charAt(midIndex + i + isEvenLength);
			
			if(a == b) {
				palindrome = a + palindrome + b;
			}
			else {
				break;
			}
		}
		
		return palindrome;
	}
}
