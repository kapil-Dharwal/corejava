import java.util.Scanner;
class Vehicle
{
	String colour,brand,space,wheels,height,weight;
	public Vehicle(String colour,String brand,String space,String wheels)
	{  
		this.colour=colour;
		this.brand=brand;
		this.space=space;
		this.wheels=wheels;
	}
	public void vehicle()
	{
		System.out.println("Car Colour  :"+this.colour+"\n");
		System.out.println("Car Brand   :"+this.brand+"\n");
		System.out.println("Car Space   :"+this.space+"\n");
		System.out.println("Car Wheels  :"+this.wheels+"\n");
	}
}
class Car extends Vehicle
{    
    private String name,model;
	public Car(String colour,String brand,String space,String wheels,String name,String model)	
	{
		super(colour,brand,space,wheels);
		this.name=name;
		this.model=model;
	}
	public void car()
	{
		System.out.println("Car Name    :"+this.name+"\n");
		System.out.println("Car Model   :"+this.model+"\n");
		super.vehicle();
	}	
}
class Bus extends Vehicle
{    
    private String name,model;
	public Bus(String colour,String brand,String space,String wheels,String name,String model)	
	{
		super(colour,brand,space,wheels);
		this.name=name;
		this.model=model;
	}
	public void bus()
	{
		System.out.println("Bus Name    :"+this.name+"\n");
		System.out.println("Bus Model   :"+this.model+"\n");
		super.vehicle();
	}	
}	
	
class TestMain
{
	public static void main(String args[])
	{
		Car ob=new Car("White","ford","6","4","Etos","2016");
		
               ob.car();
               Bus obj=new Bus("Yellow","aictel","50","6","School Bus","2023");
               obj.bus();
	
	}
}