package pakka;
import java.io.*;
import java.util.*;
public class Package3 {
       public static void main(String[] args)
       {
    	   Scanner in = new Scanner(System.in);
    	   int size = in.nextInt();
    	   //Multiply
    	   System.out.println("The Given Number of Size :" +size);
    	   
    	   for(int row = 1; row<=size; row++)
    	   {
    		   for(int col=1; col<=size; col++)
    		   {
    			   //print starts
    			   
    			   if(row == col || row + col == size+1)
    			  
    			   System.out.print("*");
    			   
    			   else
    				   
    			 System.out.print(" ");
    			   
    			   
    				    }
    		   
    		   System.out.println();
    	   
    	   }
    	   
    	   
    	   
    	   
       }
	
}
