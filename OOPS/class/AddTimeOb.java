import java.util.Scanner;
class Time
{
		private int h,m,s;
		public void setData(int h,int m,int s)
		{
			this.h=h;
			this.m=m;
			this.s=s;
		}
		public void display()
		{
			System.out.print(" Hours="+this.h);
			System.out.print(" Min="+this.m);
			System.out.println(" Sec="+this.s);
		}
}
class Test
{
		public static void main(String args[])
		{
			Time t1=new Time();
			Time t2=new Time();
			Time t3=new Time();
			
			t1.setData(2,45,155);
			t2.setData(5,155,55);
			
			t1.display();
			t2.display();
		}
}