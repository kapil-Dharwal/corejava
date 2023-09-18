import java.util.Scanner;
class TestMem
{  
	private int age=23;
	String name;
	class Inner
	{  
		void msg()
		{
			System.out.println("age is "+age+ "\nkapil" +name);
		}  
	}  
	public static void main(String args[])
	{  
		TestMem obj=new TestMem();  
		TestMem.Inner in=obj.new Inner();  
		in.msg();  
 }  
}  