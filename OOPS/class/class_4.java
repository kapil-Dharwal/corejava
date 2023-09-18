//all method are static define in defference class
import java.util.Scanner;
class First
{
		public static void display()
		{
			System.out.println("Hello display>>>");
		}
		public static void show()
		{
			System.out.println("Hello show>>>");
		}
}
class Test
{
		public static void main(String args [])
		{
			
		}
		static 
		{
			System.out.println("Hello static block");
			First.display();
			First.show();
		}
}

