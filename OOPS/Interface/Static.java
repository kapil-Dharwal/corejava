interface Programm
{
	int a=9,b=10;
	static void show()
	{
		System.out.println("i am show...");
	}
	static void add()
	{
		System.out.println("Add="+(a+b));
	}
	static void display()
	{
		System.out.println("I am display...");
	}
}
 class TestMain
{
	public static void main(String arg[])
	{
		Programm.add();
		Programm.show();
		Programm.display();
	}
}