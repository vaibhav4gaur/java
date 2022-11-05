import java.util.*;
public class finite {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int low = in.nextInt();
		System.out.println("Enter the Low Number:" +low);
		int high = in.nextInt();
		System.out.println("Enter the High Number:" +high);
		
		
		System.out.println("These are Prime Numbers!");
	for(int n = low ; n <= high ; n++)
	{
	  int count = 0;
	  for(int div = 2; div * div <= n ; div++)
	  {
		  if(n % div == 0) {
			  count++;
			  break;
		  }
	  }
	 
	  if(count == 0)
	  {
		  System.out.println(n);
	  }
	}
	
	}
	
}
