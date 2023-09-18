import java.util.Scanner;
abstract class Test
{
		int x;
		public Test (int x)
		{
			this.x=x;
			System.out.println("Test cons.....");
		}
		public abstract void display();
}
class Test1 extends Test
{
		int y;
		public Test1(int x1,int x2)
		{
			super (x1);
			this.y=x2;
			System.out.println("Tset1 cons....");
		}
		public void display()
		{
			System.out.print("X=" +this.x);
			System.out.println(" Y="+y);
		}
}
class Test2 extends Test
{
		int z;
		public Test2 (int x1,int x2)
		{
			super (x1);
			this.z=x2;
			System.out.println("Test2 const.....");
		}
		public void display()
		{
			System.out.println("X="+this.x);
			System.out.println("Z="+this.z);
		}
}
//client class
class TestMain
{
		public static void main(String args [])
		{
			Test ref;
			Test1 ob1=new Test1(2,4);
			Test2 ob2=new Test2(8,12);
			
			ref=ob1;
			ref.display();
			ref=ob2;
			ref.display();
		}
}