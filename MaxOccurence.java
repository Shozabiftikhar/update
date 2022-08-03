import java.util.Scanner;
public class MaxOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner obj = new Scanner(System.in);
	     System.out.println("Enter string");
	     String inputStr= obj.next();
	     char ch[] =inputStr.toCharArray(); // converts the string to a char array
	     int n= ch.length;
	     for(int i=0; i<n;i++) {
	    	 int count =1;
	    	 for(int j=i+1;j<n;j++) {
	    		 if (ch[i]==ch[j]) 
	    		 {
	    			 count = count+1;
	    			 for(int k=j;k<n-1;k++) {
	    				 ch[k]=ch[k+1];
	    			 }
	    			 j--;
	    			 n++;
	    		 }
	    	 }
	     }
	}

}
