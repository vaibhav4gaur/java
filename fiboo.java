import java.util.*;
public class fiboo {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int a = 0;
		int b = 1;
		for(int i=0 ; i<n ; i++)
		{
			System.out.println(a);
			int c = a+b;
			a=b;
			b=c;
		}
		
	}
	

}
