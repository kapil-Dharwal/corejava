//Overloaing Function
import java.util.Scanner;
class Test
{
		public void add()
		{
			int a=8;
			System.out.println("A="+a);
	
		}
		public void add()
		{
			int b=10;
			System.out.println("B="+b);
		}
		public static void main(String args[])
		{
			Test ob=new Test();
			ob.add();
		}
}