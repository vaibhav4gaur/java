package MyPackage2;

interface Student
{
	
	public void data();

}

class avi implements Student
{
	public void data()
	{
		String name = "Vaibhav Gaur";
		int Roll_no = 210102391;
		System.out.println(name);
		System.out.println(Roll_no);
	}
	
	
}





public class inter_face 
{
    public static void main(String args[])
    {
    	avi bara = new avi();
    	bara.data();
    }
}
