import java.util.*;
public class StringTokenizer {
	
 	 private String inputString;


	 
	 //Defualt constucter
	 public StringTokenizer()
	 {

	 }
	  //Parameterize constucter
	  public StringTokenizer(string inputstring)
	  {
		this.inputString=inputstring;
 
	  }
	   //setter constucter

	  public void setInputString(string input )
	  {
		this.inputString=input;


	  }
	  	   //Getter constucter

			 public string  setInputString( )
			 {
			    return inputString;
	   
	   
			 }
	 public int CountToken( )
	  {
				int counter=0;
				int n= inputString.length();
				char[] ch= new char[n];
				for(int i=0;i<n;i++) 
				{
				   ch[i]=inputString.charAt(i);
				   if (ch[i]=='@'|| ch[i]==','||ch[i]==' '|| ch[i]=='*'||ch[i]=='#')
				   {
					   counter++;
				   }
			   }
				return counter;
		}

	
	public static void main(String[] args) {
		
    	
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Please enter any string input");
    	String inputString = myObj.nextLine(); 

    	StringTokenizer stringTokenizer=new StringTokenizer();
		stringTokenizer. setInputString( inputString );
    	
    	int count=stringTokenizer.CountToken();
    	System.out.println("Delimeters counted are " + count);

	}
}
