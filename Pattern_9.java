package pakka;

public class Pattern_9{

	public static void main(String[] args)
	{
		
		int size=5;
		
		for(int row=0; row<size; row++)
		{
			for(int col=0; col<size; col++)
			{
//				if(col>row)
				if(row>col)
					System.out.print(" ");
				else
					System.out.print("*");
			}
		     System.out.println();
		
		}
		
		
	}
	
	
	
}
