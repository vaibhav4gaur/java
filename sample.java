package MyPackage2;


import java.io.*;

interface intfA{
	
	void geekName();

}

interface intfB{
	
	void geekInstitute();
}

interface intfC{
	
	void geekBranch();
}



public  class sample implements intfC {
	
	public void geekName() {
		System.out.println("Vaibhav Gaur");
	}
	
	public void geekInstitute()
	{
		System.out.println("DIT");
	}
	public void geekBranch()
	{
		System.out.println("BTCSE");
	}
	public static void main(String args[])
	{
		
		sample ob1 = new sample();
		
		ob1.geekName();
		
		ob1.geekInstitute();
		
		ob1.geekBranch();
		
		
		
	}

}
