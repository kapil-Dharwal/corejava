import  java.util.Scanner;
class Test
{
		public void display()
		{
			int a=8;
			System.out.println("Hello Display");
			System.out.println("A="+a);
			System.out.println("_____________");
			this.show(a);
		}
		public void show(int x)
		{
			System.out.println("Hello Show");
			System.out.println("x="+x);
		}
		public static void main(String[]args)
		{
			Test ob=new Test();
			ob.display();
		}
}