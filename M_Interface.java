package MyPackage2;

import java.util.*;
import java.io.*;
import java.lang.*;

class one{
	public void print_vaibhav()
	{
		System.out.println("vaibhav");
	}
}
class two extends one{
	public void print_for() {
		System.out.println("for");
	}
}
class logic extends two{
	public void print_coding() {
		System.out.println("coding");
	}
}

public class M_Interface 
{
	public static void main(String[] args) 
	{
		logic keat = new logic();
		keat.print_vaibhav();
		keat.print_for();
		keat.print_coding();
	}

}
