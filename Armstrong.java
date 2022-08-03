

public class Armstrong {

	public static void main(String[] args) {
		
		 

		
		
		int n;  
		double sum = 0;
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		 
		n=sc.nextInt();  
		  
		int[] array = new int[n];  
		System.out.println("Enter the elements of the array: "); 
		
		for(int i=0; i<n; i++)  
		{    
		array[i]=sc.nextInt();  
		}  
		
        for(int k = 0; k < array.length; k++)
        {            
        int temp;
        temp = array[k] ;
        		String a = String.valueOf(temp);
        		       		int m= a.length();        	    
       		for(int j = 0; j < m; j++)
       		{       		        		
        		char b;
        			 b =a.charAt(j);
                int c = Character.getNumericValue(b);
                
      			double mult = Math.pow(c, m);
       			
       			sum = sum + mult;     		
      		}
       	 if(array[k] == sum) 
   		{   sum=0;
   			System.out.println(array[k] + " is an Armstrongs number ");
   		}
   		else
   		{ sum=0;
    			System.out.println(array[k] + " is not an Armstrongs number ");
    		}
       	
        }
       
  		
	
}

}
