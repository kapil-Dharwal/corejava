class MyThreadRun implements Runnable
{
	Thread thob;
	public MyThreadRun(String name)
	{
		thob=new Thread(this,name);
		thob.start();
	}
	//@Override
	public void run()
	{
		int i;
		for(i=0;i<=10;i++)
		{
			System.out.println(" "+thob.getName()+i);
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e1){}
		}
	}
}
public class Test
{
	public static void main(String args [])
	{
		MyThreadRun ob1=new MyThreadRun("swt");
		MyThreadRun ob2=new MyThreadRun("kpl");
		
		try
		{
			ob1.thob.join();
		}
		catch (InterruptedException e){}
		
	}
}