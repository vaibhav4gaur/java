package pakka;

public class Pattern6 {
    public static void main(String[] args)
    {
         int size = 4;
         for(int row = 1;row<=size;row++)
         {
        	 for(int col=1;col<=row;col++)
        	 {
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }
         
//         int size=5;
 		for(int row=1; row<size; row++)
 		{
 			for(int col=0; col<size-row; col++)
 			
 				System.out.print("*");
 				System.out.println();
 			
 		}
       
    }
}
