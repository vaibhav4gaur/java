package MyPackage2;

import java.io.*;

abstract class Demo
{
	
	abstract void m1();
	abstract void m2();
	abstract void m3();
	
}
abstract class firstchild extends Demo{
     	 public  void m1()
	{
		System.out.println("Inside m1");
	}
}

abstract class SecondChild extends firstchild
{
	public void m2()
	{
		System.out.println("Inside m2");
	}
	
	
}

 class ThirdChild extends SecondChild
{
	public void m3()
	{
		System.out.println("Inside m3");
	}
}

 class _observe1_ 
 {
     public static void main(String args[])
     {
    	 ThirdChild t = new ThirdChild();
//         SecondChild t = new SecondChild();
    	 t.m1();
    	 t.m2();
    	 t.m3();
     }
}
