import java.util.Scanner;
class Test
{
		int x;
		public Test(int x)
		{
			this.x=x;
		}
		void display()
		{
			System.out.println("Test class x="+this.x);
		}
}
class Test1 extends Test
{
		int x;
		public Test1(int x1,int x2)
		{
			super(x1);
			this.x=x2;
		}
		void display()
		{
			super.display();
			System.out.println("Test1 class x="+this.x);
		}
}
class Test2 extends Test1
{
		int x;
		public Test2(int x1,int x2,int x3)
		{
			super(x1,x2);
			this.x=x3;
		}
		void display()
		{
			super.display();
			System.out.println("Test2 class x="+this.x);
		}
}
class TestMain
{
		public static void main(String arg[])
		{
			Test2 ob2=new Test2(3,12,15);
			ob2.display();
		}	
}