package Pkg_Car;
import Pkg_Vehicle.Vehicle;

public class Car extends Vehicle
{
		public car( String color,String name,String price,String weel,String seat)
		{
			super(color,name,price,weel,seat);
		}
		public void display()
		{	
				System.out.println(" car  ="+name);
				System.out.println(" color  ="+color);
				System.out.println(" price ="+price);
				System.out.println(" weel ="+weel);
				System.out.println(" seat="+seat);
		}		
}