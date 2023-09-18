import java.util.Scanner;
abstract class Shape
{
	   String name;
	   float side1;
	   public Shape(String name,float side1)
	   {
		   this.name=name;
		   this.side1=side1;
	   }
	   public abstract void area();
	   public abstract void display();
}
abstract class TwoD extends Shape
{
		public TwoD(String name,float side1)
		{
			super(name,side1);
		}
		public abstract void perimeter();
}
abstract class OneSide extends TwoD
{
		public OneSide(String name,float side1)
		{
			super(name,side1);
		}
}
abstract class TwoSide extends TwoD
{
		float side2;
		public TwoSide(String name,float side1,float side2)
		{
			super(name,side1);
			this.side2=side2;
		}
}
abstract class ThreeSide extends TwoD
{
		float side2;
		float side3;
		public ThreeSide(String name,float side1,float side2,float side3)
		{
			super(name,side1);
			this.side2=side2;
			this.side3=side3;
		}
}
abstract class ThreeD extends Shape
{
		public ThreeD(String name,float side1)
		{
			super(name,side1);
		}
		public abstract void curdSurfaceArea();
		public abstract void volume();
}
abstract class ThreedOneSide extends ThreeD
{
		public ThreedOneSide(String name,float side1)
		{
			super(name,side1);
		}
}
abstract class ThreedTwoSide extends ThreeD
{
		float side2;
		public ThreedTwoSide(String name,float side1,float side2)
		{
			super(name,side1);
			this.side2=side2;
		}
}
abstract class ThreedThreeSide extends ThreeD
{
		float side3;
		float side2;
		public ThreedThreeSide(String name,float side1,float side2,float side3)
		{
			super(name,side1);
			this.side2=side2;
			this.side3=side3;
		}
}
class Circle extends OneSide
{
		public Circle(String name,float side1)
		{
			super(name,side1);
		}
		public void display()
		{
			System.out.println("\tName         : "+name);
			System.out.println("\tRadius       : "+side1);
			System.out.println("\tDiameter     : "+side1*2);
			this.area();
		}
		public void area()
		{
			System.out.println("Area         : "+3.14f*side1*side1);
			this.perimeter();
		}
		public void perimeter()
		{
			System.out.println("Circumference : "+2*3.14f*side1);
		} 
}
class EquilateralTriangl extends OneSide
{
		public EquilateralTriangl(String name,float side1)
		{	
			super(name,side1);
		}
		public void display()
		{
			System.out.println("Name        : "+name);
			System.out.println("Vertices      : "+side1);
			this.area();   
		}
		public void area()
		{
			System.out.println("Area         : "+(1.732f/4)*(side1*side1));
			this.perimeter();        
		}
		public void perimeter()
		{
			System.out.println("Perimeters    : "+3*side1);
		}
}
class Square extends OneSide
{
		public Square(String name,float side1)
		{
			super(name,side1);
		}
		public void display()
		{
			System.out.println("Name          : "+name);
			System.out.println("Vertices      : "+side1);
			this.area();   
		}
		public void area()
		{
			System.out.println("Area         : "+(side1*side1));
			this.perimeter();        
		}
		public void perimeter()
		{
			System.out.println("Perimeters    : "+4*side1);
		}
}
class Hexagon extends OneSide
{
		public Hexagon(String name,float side1)
		{
			super(name,side1);
		}
		public void display()
		{
			System.out.println("Name        : "+name);
			System.out.println("Vertices      : "+side1);
			this.area();   
		}
		public void area()
		{
			System.out.println("Area         : "+(3*(Math.sqrt(3))*side1*side1)/2);
			this.perimeter();        
		}
		public void perimeter()
		{
			System.out.println("Perimeters    : "+6*side1);
		}
}
class Rectangle extends TwoSide
{
		public Rectangle(String name,float side1,float side2)
		{
			super(name,side1,side2);
		}

		public void display()
		{
			System.out.println("Name        : "+name);
			System.out.println("Length       : "+side1);
			System.out.println("Breadth      : "+side2);
			this.area();   
		}
		public void area()
		{
			System.out.println("Area         : "+(side1*side2));
			this.perimeter();        
		}
		public void perimeter()
		{
			System.out.println("Perimeters    : "+2*(side1+side2));
		}
}
class IsoscelesTriangl extends TwoSide
{
		public IsoscelesTriangl(String name,float side1,float side2)
		{
			super(name,side1,side2);
		}
		public void display()
		{
			System.out.println("Name        : "+name);
			System.out.println("Height       : "+side1);
			System.out.println("Base        : "+side2);
			this.area();   
		}
		public void area()
		{
			System.out.println("Area         : "+(side1*side2)/2);
			this.perimeter();        
		}
		public void perimeter()
		{
			System.out.println("Perimeters    : "+(side2+(Math.sqrt(side2*side2+4*(side1*side1)))));
		}
} 
class RightAngleTringle extends TwoSide
{
		public RightAngleTringle(String name,float side1,float side2)
		{
			super(name,side1,side2);
		}
		public void display()
		{
			System.out.println("Name        : "+name);
			System.out.println("Height       : "+side1);
			System.out.println("Base        : "+side2);
			this.area();   
		}
		public void area()
		{
			System.out.println("Area         : "+(side1*side2)/2);
			this.perimeter();        
		}
		public void perimeter()
		{
			System.out.println("Perimeters    : "+(side1+side2+Math.sqrt((side1*side1)*(side2*side2))));
		}
}
class Parallelogram extends TwoSide
{
		public Parallelogram(String name,float side1,float side2)
		{
			super(name,side1,side2);
		}
		public void display()
		{
			System.out.println("Name        : "+name);
			System.out.println("Height      : "+side1);
			System.out.println("Base        : "+side2);
			this.area();   
		}
		public void area()
		{
			System.out.println("Area         : "+(side1*side2));   
		}
		public void perimeter()
		{
		   
		}
}
class Rhombus  extends TwoSide
{
		public Rhombus(String name,float side1,float side2)
		{
			super(name,side1,side2);
		}
		public void display()
		{
			System.out.println("Name        : "+name);
			System.out.println("Digonal 1   : "+side1);
			System.out.println("Digonal 2   : "+side2);
			this.area();   
		}
		public void area()
		{
			System.out.println("Area         : "+(side1*side2)/2);
			this.perimeter();        
		}
		public void perimeter()
		{
			System.out.println("Perimeters    : "+(2*Math.sqrt((side1*side1)+(side2*side2))));
		}
}
class ScaleneTriangle extends ThreeSide
{
		public ScaleneTriangle(String name,float side1,float side2,float side3)
		{
			super(name,side1,side2,side3);
		}
		public void display()
		{
			System.out.println("Name        : "+name);
			this.area();    
		}
		public void area()
		{
			float s;
			s=(side1+side2+side3)/2;
			System.out.println("Area         : "+Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)));
			this.perimeter();        
		}
		public void perimeter()
		{
			System.out.println("Perimeters    : "+(side1+side2+side3));
		}
}
class Trapezium extends ThreeSide
{
		public Trapezium(String name,float side1,float side2,float side3)
		{
			super(name,side1,side2,side3);
		}
		public void display()
		{
			System.out.println("Name        : "+name);
			this.area();    
		}
		public void area()
		{
			System.out.println("Area         : "+((side1+side2)*side3)/2);
			this.perimeter();        
		}
		public void perimeter()
		{
			System.out.println("Perimeters    : "+(side1+side2+2*(Math.sqrt((side3*side3)+((side1-side2)/2)*((side1-side2)/2)))));
		}
}
class Cube extends ThreedOneSide
{
		public Cube(String name,float side1)
		{
			super(name,side1);
		}
		public void display()
		{
			System.out.println("Name       : "+name);
			this.area();
		}
		public void area()
		{
			System.out.println("Surfac area  : "+(6*side1*side1));
			this.volume();
		}
		public void curdSurfaceArea()
		{
		}
		public void volume()
		{
			System.out.println("Volume     : "+(side1*side1*side1));
		}
}
class Sphere extends ThreedOneSide
{
		public Sphere(String name,float side1)
		{
			super(name,side1);
		}
		public void display()
		{
			System.out.println("Name       : "+name);
			System.out.println("Radius     : "+side1);
			this.area();
		}
		public void area()
		{
			System.out.println("Surfac area  : "+4*(3.14f*side1*side1));
			this.volume();
		}
		public void curdSurfaceArea()
		{
        System.out.println("Curd Surfac area: "+4*(3.14f*side1*side1));
		}
		public void volume()
		{
			System.out.println("Volume     : "+4/3*(3.14f*side1*side1*side1));
			this.curdSurfaceArea();
		}
}
class Hemisphere extends ThreedOneSide
{
    public Hemisphere(String name,float side1)
    {
        super(name,side1);
    }
		public void display()
		{
			System.out.println("Name       : "+name);
			System.out.println("Radius     : "+side1);
			this.area();
		}
		public void area()
		{
			System.out.println("Surfac area  : "+2*(3.14f*side1*side1));
			this.volume();
		}
		public void curdSurfaceArea()
		{
			System.out.println("Curd Surfac area: "+2*(3.14f*side1*side1));
		}
		public void volume()
		{
			System.out.println("Volume     : "+2f/3f*(3.14f*side1*side1*side1));
			this.curdSurfaceArea();
		}
}
class Cylinder extends ThreedTwoSide
{
		public Cylinder(String name,float side1,float side2)
		{
			super(name,side1,side2);
		}
		public void display()
		{
			System.out.println("Name       : "+name);
			System.out.println("Radius     : "+side1);
			System.out.println("Height     : "+side2);
			this.area();
		}
		public void area()
		{
			System.out.println("Surfac area  : "+(2*(3.14f*side1*side1))+(2*3.14f*side1*side2));
			this.volume();
		}
		public void curdSurfaceArea()
		{
			System.out.println("Curd Surfac area: "+2*(3.14f*side1*side2));
		}
		public void volume()
		{
			System.out.println("Volume     : "+(3.14f*side1*side1*side2));
			this.curdSurfaceArea();
		}
}
class Cuboid extends ThreedThreeSide
{
		public Cuboid(String name,float side1,float side2,float side3)
		{
			super(name,side1,side2,side3);
		}
		public void display()
		{
			System.out.println("Name       : "+name);
			System.out.println("Length     : "+side1);
			System.out.println("Width      : "+side2);
			System.out.println("Height     : "+side3);
			this.area();
		}
		public void area()
		{
			System.out.println("Surfac area  : "+2*((side1*side2)+(side1*side3)*(side2*side3)));
			this.volume();
		}
		public void curdSurfaceArea()
		{
			//System.out.println("Curd Surfac area: "+2*(3.14f*side1*side2));
		}
		public void volume()
		{
			System.out.println("Volume     : "+(side1*side2*side3));
			this.curdSurfaceArea();
		}
}
class Cone extends ThreedThreeSide
{
		public Cone(String name,float side1,float side2,float side3)
		{
			super(name,side1,side2,side3);
		}
		public void display()
		{
			System.out.println("Name       : "+name);
			System.out.println("Side      : "+side1);
			System.out.println("Radius      : "+side2);
			System.out.println("Height     : "+side3);
			this.area();
		}
		public void area()
		{
			System.out.println("Surfac area  : "+3.14f*side2*(side2+side1));
			this.volume();
		}
		public void curdSurfaceArea()
		{
			//System.out.println("Curd Surfac area: "+2*(3.14f*side1*side2));
		}
		public void volume()
		{
			System.out.println("Volume     : "+1f/3f*3.14*side2*side2*side3);
			this.curdSurfaceArea();
		}
}
class TestMain
{
		public static void main(String args[ ])
		{
			Square ob=new Square("Square",7);
			ob.display();
			EquilateralTriangl ob2=new EquilateralTriangl("EquilateralTriangl",9);
			ob2.display();
			Circle ob3=new Circle("Circle",4);
			ob3.display();
			Hexagon ob4=new Hexagon("Hexagon",10);
			ob4.display();
			Rectangle ob5=new Rectangle("Rectangle",5,9);
			ob5.display(); 
			IsoscelesTriangl ob6=new IsoscelesTriangl("IsoscelesTriangl",7,4);
			ob6.display();
			RightAngleTringle ob7=new RightAngleTringle("RightAngleTringle",8,4);
			ob7.display();
			Parallelogram ob8=new Parallelogram("Parallelogram",1,9);
			ob8.display();  
			Rhombus ob9=new Rhombus("Rhombus",3,6);      
			ob9.display();
			ScaleneTriangle ob10=new ScaleneTriangle("ScaleneTriangle",8,7,4);
			ob10.display();
			Trapezium ob11=new Trapezium("Trapezium",6,4,2);
			ob11.display();
			Cube ob12=new Cube("Cube",7); 
			ob12.display();
			Sphere ob13=new Sphere("Sphere",8);
			ob13.display();
			Hemisphere ob14=new Hemisphere("Hemisphere",15);
			ob14.display();
			Cylinder ob15=new Cylinder("Cylinder",4,8);
			ob15.display();
			Cuboid ob16=new Cuboid("Cuboid",7,9,5);
			ob16.display();
			Cone ob17=new Cone("Cone",1,2,3);
	   }
}
