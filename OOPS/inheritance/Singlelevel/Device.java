import java.util.Scanner;
class Divice
{
	String brand;
	public Divice(String brand)
	{
		this.brand=brand;
	}
	
}
class Speacer extends Divice
{
	String driversize;
	public Speacer(String brand,String driversize)
	{
		super(brand);
		this.driversize=driversize;
	}
	void display()
	{
		
		System.out.println("\tBRAND       "+super.brand);
		System.out.println("\tDRIVERSIZE  "+driversize);
		System.out.println("=============================");
	}
}
class Camera extends Divice
{
	String pixelsize, resolution;
	public Camera(String brand,String pixelsize,String resolution)
	{
		super(brand);
		this.pixelsize=pixelsize;
		this.resolution=resolution;
	}	
	void display()
	{
		System.out.println("=============================");
		System.out.println("\tBRAND       "+super.brand);
		System.out.println("\tPIXELSIZE   "+pixelsize);
		System.out.println("\tRESOLUTION  "+resolution);
		System.out.println("=============================");
	}
}
class TestMain
{
	public static void main(String arg[])
	{
		Camera ob=new Camera("SAMSUNG","48 MEGA","1500*950");
		ob.display();
		Speacer ob1=new Speacer("SAMSUNG","5 INCH");
		ob1.display();
	}
}