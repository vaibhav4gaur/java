package pakka;

//public class Pattern_8 {
//       public static void main(String[] args)
//       {
//    	   int size=5;
//    	   
//    	   for(int row=0;row<size;row++)
//    	   {
//    		   for(int col=0;col<size;col++)
//    		   {
//    			   
//    			   //space
//    			   
//    			   if(col<size-row-1)
//    			  
//    			   System.out.print("+");
//    			   else
//    				   System.out.print(" ");
//    			   
//    		
//    		   }System.out.println();
//    	   }
//    	   
//    	   
//    	   
//    	   
//    	   
//       }
//}


public class Pattern_8
{
	public static void main(String[] args)
	{
		 int size = 4;
         for(int row = 1;row<=size;row++)
         {
        	 for(int col=1;col<=row;col++)
        	 {
        		 System.out.print(" ");
        	 }
//        	 System.out.println();
      // 		for(int row = 1; row<size; row++)
         		//{
         			for(int col=0; col<size-row; col++)
         			
//         				System.out.print("*");
         				System.out.print("*");
         			System.out.println();
         		//}
         }
         
//         int size=5;
 	
		
		
		
		
		
		
		
	}
}


