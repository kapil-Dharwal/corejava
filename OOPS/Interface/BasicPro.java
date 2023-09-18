interface i1
{
	 void display1();
}
class Test implements i1
{
	public static void main(String arg[])
	{
		Test ob=new Test();
		ob.display1();
	}
		public void display1()
		{
		
			System.out.println("Hii Interface......");
		}
}