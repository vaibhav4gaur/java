package pakka;

public class Pattern7 {
      public static void main(String[] args)
      {
    	  
    	  int size = 5;
    	  
     	 for(int row=0; row<size; row++)
     	 {
     		 //print space
     		 for(int sp=1; sp<=size-row; sp++)
     		 
     			 System.out.print("   ");
     		 //print stars
  			for(int st=0; st<=row; st++) {
  			
  				System.out.print(" * ");
  			}
  			
  			System.out.println();
  		}
     
  		
      }
}
