import java.lang.Thread;
class MyThread extends Thread
{
	public class MyThread
	{
		public static void main(String args [])
		{
			MyThread ob1=new MyThread("First");
			MyThread ob2=new MyThread("Second");
			MyThread ob3=new MyThread("Third");
			MyThread ob4=new MyThread("Fourth");
			MyThread ob5=new MyThread("Fifth");
			
			try
			{
				ob1.join();
				ob2.join();
				ob3.join();
				ob4.join();
				ob5.join();
			}
			catch(InterruptedException e1){}
			
			System.out.println("Main thread start");
			
			for(int i=0;i<=10;i++)
			{
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException ex){}
			}
			
		}
	}
}