interface INTERFACE
{
	int a=6,b=4;
	default void show()
	{
		System.out.println("i am show");
		add();
		display();
	}
		private void add()
		{
			System.out.println("ADD="+(a+b));
		}
		private void display()
		{
			System.out.println("i am display");
		}
}
 class TestMain implements INTERFACE 
{
	public static void main(String arg[])
	{
		TestMain ob=new TestMain();
		ob.show();
	}
}