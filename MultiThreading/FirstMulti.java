import java.lang.String;
class MyThread extends Thread
{
	public void run()
	{
		int i;
		for(i=0;i<=10;i++)
		{
			System.out.println(this.getName()+"="+i);
		}
	}
}
class T1
{
	public static void main(String args [])
	{
		MyThread ob1=new MyThread();
		MyThread ob2=new MyThread();
		MyThread ob3=new MyThread();
		MyThread ob4=new MyThread();
		MyThread ob5=new MyThread();
		System.out.println(" "+ob1.getName());
		ob1.start();
		ob2.start();
		ob3.start();
		ob4.start();
		ob5.start();
	}
}