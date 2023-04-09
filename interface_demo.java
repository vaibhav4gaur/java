package packa;


interface i1
{
	int a = 10;
	void help();
}
public class interface_demo implements i1 {
	public void help()
	{
		System.out.println("help method of interface");
	}
	public static void main(String[] args)
	{
		interface_demo ob = new interface_demo();
		ob.help();
		System.out.println(ob.a);
	}

}
