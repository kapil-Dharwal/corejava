import java.util.Scanner;
abstract class Shape
{
	public abstract void area();
}
abstract class OneD extends Shape
{
	public abstract void area();
}
abstract class TwoD extends Shape
{
	int r;
	public TwoD(int r)
	{
		this.r=r;
	}
	public abstract void area();
}
class Circle extends TwoD
{
	
	public Circle(int r)
	{
		super(r);
	}
	public void area()
	{
		System.out.println("Area of Circle="+3.14*r*r);
	}
}
class Rectangle extends TwoD
{
	int l;
	public Rectangle(int r,int l)
	{
		super(r);
		this.l=l;
	}
	public void area()
	{
		System.out.println("Area of rectangle="+r*l);
	}
}
class Triangle extends TwoD
{
	int b;
	public Triangle(int r,int b)
	{
		super(r);
		this.b=b;
	}
	public void area()
	{
		System.out.println("Area of Triangle="+(r*b)/2);
	}
}
abstract class ThreeD extends Shape
{
	int a;
	public ThreeD(int a)
	{
		this.a=a;
	}
	public abstract void area();
}
class Cube extends ThreeD
{
	public Cube(int a)
	{
		super(a);
	}
	public void area()
	{
		System.out.println("Area of cube="+6*a*a);
	}
}
class Cone extends ThreeD
{
	int r;
	public Cone(int a,int r)
	{
		super(a);
		this.r=r;
	}
	public void area()
	{
		System.out.println("Area of cone="+3.14*r*(r+a));
	}
}
class Cylinder extends ThreeD
{
	int h;
	public Cylinder(int a,int h)
	{
		super(a);
		this.h=h;
	}
	public void area()
	{
		System.out.println("Area of cylinder="+2*3.14*a*(a+h));
	}
}
class TestMain
{
	public static void main(String args[])
	{
		Shape ref;
		Circle C=new Circle(5);
		Rectangle R=new Rectangle(2,7);
		Triangle T=new Triangle(3,6);
		
		ref=C;
		C.area();
		
		ref=R;
		ref.area();
		
		ref=T;
		ref.area();
		
		Cube ob=new Cube(3);
		Cone ob2=new Cone(4,2);
		Cylinder ob3=new Cylinder(2,3);
		
		ref=ob;
		ref=ob2;
		ref=ob3;
		
		ob.area();
		ob2.area();
		ob3.area();
	}
}