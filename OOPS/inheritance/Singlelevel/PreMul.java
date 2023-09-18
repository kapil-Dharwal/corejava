import java.util.Scanner;
class A
{
		void showA(int a,int b)
		{
			System.out.println("A="+a+"\nB="+b);
		}
}
class B extends A
{
		 void showB(int a,double b,int c)
		{
			System.out.println("A="+a+"\nB="+b+"\nC="+c);
		}
}
class C extends B
{
		public static void main(String[] args)
		{
			C k=new C();
			k.showA(5,4);
			k.showB(10,5,10);
		}
}