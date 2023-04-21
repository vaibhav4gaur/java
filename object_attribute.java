package MyPackage2;

public class object_attribute {
static String name;
static double price;

 static  void set(String n,double p) {
	name = n;
	price = p;
	 
}
	static void get() {
	System.out.println("My name as a Software is :" +name);
	System.out.println("My price as a Software is :" +price);
		
	}
	public static void main(String[] args)
	{
		object_attribute.set("Eclipse IDE", 9.0);
		object_attribute.get();
		
	}
	
}
