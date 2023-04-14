package pakka;

public class Pattern_9 {

	public static void main(String[] args)
	{
		
		int size=5;
		
		for(int row=0; row<size; row++)
		{
			//Pattern ->4 = space
			for(int sp=0; sp<=row; sp++)
				System.out.print("*");
			
			
			//Pattern ->5 = star
			for(int st=0; st<size-row; st++)
				System.out.print("-");
			System.out.println();
		
		
		}
		
		
	}
	
	
	
}
