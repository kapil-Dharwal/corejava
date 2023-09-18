//all method are non static define with in same class
import java.util.Scanner;
class Test
{
		public static void display()
		{
			System.out.println("Hello display>>>>");
		}
		public void show()
		{
			System.out.println("Hello Show>>>");
		}
		public static void main(String args[])
		{
			Test.display();
		}

		static 
		{
			System.out.println("Hello static block>>>");
			Test.display();
			new Test().show();
		}
}
		
