package packa;

public class threadrunnable implements Runnable {
	public void run() {
		for(int i=0; i<10; i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
	public static void main(String[] args)
	{
		threadrunnable ob1 = new threadrunnable();
		threadrunnable ob2 = new threadrunnable();
		
		Thread t1 = new Thread(ob1);
		Thread t2 = new Thread(ob2);
	    t1.start();
	    t2.start();
	
	}

}
