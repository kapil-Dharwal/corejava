import java.util.Scanner;
class Train
{
	String exname;
	String destination,origin;
	String time;
	Passenger passenger;
	public  Train(String exname,String destination,String origin,String time,String name,int seatno,int price)
	{
		this.exname=exname;
		this.destination=destination;
		this.origin=origin;
		this.time=time;
		passenger=new Passenger(name,seatno,price);
	
	}
	void displayTrain()
	{
		System.out.println("   EXNAME       :"+this.exname);
		System.out.println("   DESTINATION  :"+this.destination);
		System.out.println("   ORIGIN       :"+this.origin);
		System.out.println("   TIME         :"+this.time);
		passenger.displayPassenger();
	}
	class Passenger
	{
		String name;
		int seatno,price;
		public Passenger(String name,int seatno,int price)
		{
			this.name=name;
			this.seatno=seatno;
			this.price=price;
		
		}
		void displayPassenger()
		{
			System.out.println("   PASSENGER NAME   :"+name);
			System.out.println("   SEATNUMBER       :"+seatno);
			System.out.println("   PRICE            :"+price);
		}
	}	
}
class TestMain
{
	
	public static void main(String arg[])
	{
		Train ob=new Train("\tsuperexpress", "\tbhopal","\tkhategaon","\t10 am","\tpiyush",50,750);
		ob.displayTrain();
	}
}