import java.util.Scanner;
class Greatest
{
		public double a,b,c,d;
		public void setData(int a,int b,int c,int d)
		{
			this.a=a;
			this.b=b;
			this.c=c;
			this.d=d;
		}
		public void greater()
		{
			
			if(a>b && a>c && a>d)
				System.out.println("A is greatest....");
			else if(b>c && b>d)
				System.out.println("B is greatest....");
			else if(c>d)
				System.out.println("C is greatest....");
			else
				System.out.println("D is greatest....");
		}
}
class Test
{
		public static void main(String args[])
		{
			Greatest ob=new Greatest();
			ob.setData(8,7,9,5);
			ob.greater();
		}
}