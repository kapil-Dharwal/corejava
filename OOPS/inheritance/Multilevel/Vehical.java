import java.util.Scanner;
class Vehicle 
{
		String colour, brand, space, wheels, height, weight;
		public void setData(String colour,String brand,String space,String wheels,String height,String weight) 
		{  
			this.colour = colour;
			this.brand = brand;
			this.space = space;
			this.wheels = wheels;
			this.height = height;
			this.weight = weight;
		}
		public void vehicle()
		{
			System.out.println("Car Colour  : " + this.colour + "\n");
			System.out.println("Car Brand   : " + this.brand + "\n");
			System.out.println("Car Space   : " + this.space + "\n");
			System.out.println("Car Wheels  : " + this.wheels + "\n");
			System.out.println("Car Height  : " + this.height + "\n");
			System.out.println("Car Weight  : " + this.weight + "\n");
		}
}

class Car extends Vehicle 
{    
		private String name,model;
		public void setData(String colour,String brand,String space,String wheels,String name,String model,String height,String weight)
		{
			this.name = name;
			this.model = model;
			super.setData(colour,brand,space,wheels,height,weight);
		}
		public void car()
		{
			System.out.println("Car Name    : " + this.name + "\n");
			System.out.println("Car Model   : " + this.model + "\n");
			super.vehicle();
		}
}

class SportsCar extends Car 
{
		private String type;
		public void setData(String colour,String brand,String space,String wheels,String name,String model,String height,String weight,String type) 
		{
			super.setData(colour,brand,space,wheels,name,model,height,weight);
			this.type = type;
		}
		public void sportsCar()
		{
			System.out.println("Sports Car Type: " + this.type + "\n");
			super.car();
		}
}

class TestMain
 {
		public static void main(String args[]) 
		{
			Scanner sc = new Scanner(System.in);
        
			// Vehicle properties
			System.out.println("Enter Car Colour");
			String colour = sc.nextLine();
			System.out.println("Enter Car Brand");
			String brand = sc.nextLine();
			System.out.println("Enter Car Space");
			String space = sc.nextLine();
			System.out.println("Enter Car Wheels");
			String wheels = sc.nextLine();
        
			// New properties
			System.out.println("Enter Car Height");
			String height = sc.nextLine();
			System.out.println("Enter Car Weight");
			String weight = sc.nextLine();
			
			// Car properties
			System.out.println("Enter Car Name");
			String name = sc.nextLine();
			System.out.println("Enter Car Model");
			String model = sc.nextLine();
			
			// Sports car properties
			System.out.println("Enter Sports Car Type");
			String type = sc.nextLine();
			
			SportsCar ob=new SportsCar();
			ob.setData(colour,brand,space,wheels,name,model,height,weight,type);
			ob.sportsCar();
		}
}