import java.util.Scanner;
class Test
{
		public void display()
		{
			int a=8;
			System.out.println("hello display");
			System.out.println("A="+a);
			System.out.println("-------------");
			int k= this.show(a);
			System.out.println("Value="+k);
		}
		public int show(int a)
		{
			int x=7;
			System.out.println("A="+a);
			System.out.println("hello show");
			return x;
		}
		public static void main(String args[])
		{
			Test ob=new Test();
			ob.display();
		}
}