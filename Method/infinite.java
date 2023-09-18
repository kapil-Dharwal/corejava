//infinite
import java.util.Scanner;
class Test
{
		public void display()
		{
			int a=8;
			System.out.println("Hello Display.....");
			System.out.println("A="+a);
			System.out.println("..................");
			this.show();
		}
		public void show()
		{
			this.display();
		}
		public static void main(String args[])
		{
			Test ob=new Test();
			ob.display();
		}
}