import java.util.Scanner;
class Area
{
		int l;
		int b;
		public void setData(int l,int b)
		{
			this.l=l;
			this.b=b;
		}
		public int a()
		{
			return this.l*this.b;
		}
}
class Volume extends Area
{	
		int h;
		public void setData(int l,int b,int h)
		{
			this.setData(l,b);
			this.h=h;
		}
		public int v()
		{
			return this.a()*this.h;
		}
}
class Density extends Volume
{
		double m;
		public void setData(int l,int b,int h,double m )
		{
			this.setData(l,b,h);
			this.m=m;
		}
		public double d()
		{
			return this.m/this.v();
		}
}
class TestMain
{
		public static void main(String arg[])
		{
			Density ob=new Density();
			ob.setData(5,8,9,496.5);
			System.out.println("Area="+ob.a());
			System.out.println("volume="+ob.v());
			System.out.println("volume="+(ob.d())).Math.round(3);
		}
}