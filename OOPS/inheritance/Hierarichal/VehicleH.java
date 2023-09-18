import java. util. Scanner;
abstract class Vehicle
{
    String name,brand,color;
    int seating,cost ;
    public Vehicle (String name, String brand, String color,int seating, int cost)
    {
        this.name=name;
        this.brand=brand;
        this.color=color;
        this.seating=seating;
        this.cost=cost;
    }
    public abstract void display ();
    public abstract void breaks();
    public abstract void drive();
}
abstract class Land extends Vehicle
{
    int wheels;
    public Land(String name, String brand, String color, int seating, int cost,int wheels)
    {
        super(name,brand,color,seating,cost);
        this. wheels=wheels;
    }
}
class Cycle extends Land
{
    public Cycle(String name, String brand, String color, int seating, int cost,int wheels)
    {
        super(name,brand,color,seating,cost,wheels);
    }
    public void drive()
    {
        System. out. println("Vehicle Started ");
    }
    public void breaks()
    {
        System.out.println("Vehicle Stoped");
    }
    public void display ()
    {
        System.out.println("Name :"+name);
        System.out.println("Brand  :"+brand);
        System. out. println("Color  :"+color);
        System. out. println("Seating Capacity "+seating );
        System. out. println("Cost. :"+cost);
        System. out. println("Wheels.  "+wheels);
    }
}
class Bike extends Land
{
    public Bike(String name, String brand, String color, int seating, int cost,int wheels)
    {
        super(name,brand,color,seating,cost,wheels);
    }
    public void drive()
    {
        System. out. println("Vehicle Started ");
    }
    public void breaks()
    {
        System.out.println("Vehicle Stoped");
    }
    public void display ()
    {
        System.out.println("Name :"+name);
        System.out.println("Brand  :"+brand);
        System. out. println("Color  :"+color);
        System. out. println("Seating Capacity "+seating );
        System. out. println("Cost. :"+cost);
        System. out. println("Wheels.  "+wheels);
    }
}
class Car extends Land
{
    public Car(String name, String brand, String color, int seating, int cost,int wheels)
    {
        super(name,brand,color,seating,cost,wheels);
    }
    public void drive()
    {
        System. out. println("Vehicle Started ");
    }
    public void breaks()
    {
        System.out.println("Vehicle Stoped");
    }
    public void display ()
    {
        System.out.println("Name :"+name);
        System.out.println("Brand  :"+brand);
        System. out. println("Color  :"+color);
        System. out. println("Seating Capacity "+seating );
        System. out. println("Cost. :"+cost);
        System. out. println("Wheels.  "+wheels);
    }
}
abstract class Water extends Vehicle
{
    public Water(String name, String brand, String color, int seating, int cost)
    {
        super(name,brand,color,seating,cost);
    }
}
class Ship extends Water
{
    int propellers;
    public Ship (String name, String brand, String color, int seating, int cost)
    {
        super(name,brand,color,seating,cost);
        this. propellers=propellers;
    }
    public void drive()
    {
        System. out. println("Vehicle Started ");
    }
    public void breaks()
    {
        System.out.println("Vehicle Stoped");
    }
    public void display ()
    {
        System.out.println("Name :"+name);
        System.out.println("Brand  :"+brand);
        System. out. println("Color  :"+color);
        System. out. println("Seating Capacity "+seating );
        System. out. println("Cost. :"+cost);
        System. out. println("propellers.  "+propellers);
    }
}
class Boat extends Water
{
    public Boat(String name, String brand, String color, int seating, int cost)
    {
        super(name,brand,color,seating,cost);
    }
    public void drive()
    {
        System. out. println("Vehicle Started");
    }
    public void breaks()
    {
        System.out.println("Vehicle Stoped");
    }
    public void display ()
    {
        System.out.println("Name :"+name);
        System.out.println("Brand  :"+brand);
        System. out. println("Color  :"+color);
        System. out. println("Seating Capacity "+seating );
        System. out. println("Cost. :"+cost);
    }
}
class Submarine extends Water
{
    int propellers;
    public Submarine (String name, String brand, String color, int seating, int cost,int propellers)
    {
        super(name,brand,color,seating,cost);
        this. propellers=propellers;
    }
    public void drive()
    {
        System. out. println("Vehicle Start ");
    }
    public void breaks()
    {
        System.out.println("Vehicle Stop");
    }
    public void display ()
    {
        System.out.println("Name :"+name);
        System.out.println("Brand  :"+brand);
        System. out. println("Color  :"+color);
        System. out. println("Seating Capacity "+seating );
        System. out. println("Cost. :"+cost);
        System. out. println("Propellers  "+propellers);
    }
}
abstract class AIR extends Vehicle
{
    public AIR(String name, String brand, String color, int seating, int cost)
    {
        super(name,brand,color,seating,cost);
    }
}
class Aeroplane extends AIR
{
    public Aeroplane (String name,String brand,String color,int seating,int cost)
    {
        super(name,brand,color,seating,cost);
    }
    public void drive()
    {
        System. out. println("Vehicle Started");
    }
    public void breaks()
    {
        System.out.println("Vehicle Stoped");
    }
    public void display ()
    {
        System.out.println("Name :"+name);
        System.out.println("Brand  :"+brand);
        System. out. println("Color  :"+color);
        System. out. println("Seating Capacity "+seating );
        System. out. println("Cost. :"+cost);
    }
}
class Helicopter extends AIR
{
    int gates;
    public Helicopter(String name, String brand, String color, int seating, int cost,int gates)
    {
        super(name,brand,color,seating,cost);
        this. gates=gates;
    }
    public void drive()
    {
        System. out. println("Vehical Started ");
    }
    public void breaks()
    {
        System.out.println("Vehicle Stoped");
    }
    public void display ()
    {
        System.out.println("Name :"+name);
        System.out.println("Brand  :"+brand);
        System. out. println("Color  :"+color);
        System. out. println("Seating Capacity "+seating );
        System. out. println("Cost. :"+cost);
        System. out. println("no.of gates "+gates);
    }
}
class TestMain
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Your Choices Are:");
        System. out. println("-----------Modes  of Transport-------------");
        System. out. println("1:   Land ");
        System. out. println("2:   AIR  ");
        System. out. println("3:   WATER");
        int ch=sc.nextInt();
        switch (ch)
        {
			case 1:
			int c;
			System. out. println("----------LAND---------");
			System. out. println("1:Cycle ");
			System. out. println("2: Bike   ");
			System. out. println("3: Car.  ");
			System. out. println("4:exit.  ");
			System. out. println("----------------------------"); c=sc.nextInt();
            switch (c)
            {
				case 1:
				Cycle cy=new Cycle("nrw","Atlas","Red",1,4000,2);
				cy.drive();
				cy. display();
				cy. breaks();
				break;
				case 2:
				Bike b=new Bike("km","bullet","Black",2,100000,2);
				b. drive();
				b. display ();
				b. breaks ();
				break;
				case 3:
				Car car=new Car("km","Bulero","Black",2,150000,2);
				car. drive();
				car. display ();
				car. breaks ();
				break;
				case 4:
				    System. exit(0);
			}
			    break;
				case 2:
				System. out. println("----------AIR---------");
				System. out. println("1:Aeroplane ");
				System. out. println("2:Helicopter   ");
				System. out. println("3:exit.  ");
				System. out. println("----------------------------"); c=sc.nextInt();
				switch (c)
				{
					case 1:
					Aeroplane aero=new Aeroplane ("nrw","Atlas","Red",1,4000);
					aero.drive();
					aero. display();
					aero. breaks();
					break;
					case 2:
					Helicopter  hb=new Helicopter ("km","bullet","Black",2,100000,2);
					hb. drive();
					hb. display ();
					hb. breaks ();
					break;
					case 3:
					System. exit(0);
				}
			    break;
				case 3:
				int cx;
				System. out. println("----------WATER---------");
				System. out. println("1:Ship ");
				System. out. println("2: Boat ");
				System. out. println("3: Submarine  ");
				System. out. println("4:exit.  ");
				System. out. println("----------------------------");  cx=sc.nextInt();
				switch (cx)
				{
					case 1:
					Ship sh=new Ship("nrw","Atlas","Red",1,4000);
					sh.drive();
					sh. display();
					sh. breaks();
					break;
					case 2:
					Boat bo=new Boat("km","bullet","Black",8,100000);
					bo. drive();
					bo. display ();
					bo. breaks ();
					break;
					case 3:
					Submarine sub=new Submarine ("km","Bulero","Black",150000,2,5);
					sub. drive();
					sub. display ();
					sub. breaks ();
					break;
					case 4:
					System. exit(0);
				}
                break;
        }
    }
}