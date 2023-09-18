//If static block out of main method
		/*Error: Main method not found in class First, please define the main method as:
		public static void main(String[] args)
		or a JavaFX application class must extend javafx.application.Application*/
import java.util.Scanner;
class First
{
		static 
		{
			System.out.println("Hello static block");
			First.display();
			First.show();
		}
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
}