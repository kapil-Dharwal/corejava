import java.util.Scanner;
class Two_viler
{
		String colur;
		String name;
		int speed;
		int seat;
		
		public void setColur(String colur)
		{
			this.colur=colur;
		}
		public void setName(String name)
		{
			this.name=name;
		}
		public void setSpeed(int speed)
		{
			this.speed=speed;
		}
		public void setSeat(int seat)
		{
			this.seat=seat;
		}
		public String getColur()
		{
			return this.colur;
		}
		public String getName()
		{
			return this.name;
		}
		public int getSpeed()
		{
			return this.speed;
		}
		public int getSeat()
		{
			return this.seat;
		}
}
class Motar_sycal extends Two_viler
{
		int gair;
		public void setGair(int gair)
		{
			this.gair=gair;
		}
		public int getGair()
		{
			return this.gair;
		}
		public void print()
		{
				System.out.println("\tTWOWHEELER NAME "+this.getName());
				System.out.println("\tCOLUR         "+this.getColur());
				System.out.println("\tSPEED         "+this.getSpeed());
				System.out.println("\tSEAT          "+this.getSeat());
				System.out.println("\tGEAR          "+this.getGair());
		}
}
class TestMain
{
		public static void main(String arg[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter TWO WHEELER NAME");
			String name=sc.nextLine();
			
			System.out.println("enter TWO WHEELER colur");
			String colur=sc.nextLine();
			
			System.out.println("ENTAR TWOWHEELER SEAT");
			int seat=sc.nextInt();
			
			System.out.println("ENTAR TWOWHEELERSPEED ");
			int speed=sc.nextInt();
			
			System.out.println("ENTAR A GEAR");
			int gair=sc.nextInt();
			
			Motar_sycal m=new Motar_sycal();
			
			m.setColur(colur);
			m.setName(name);
			m.setGair(gair);
			m.setSeat(seat);
			m.setSpeed(speed);
			m.print();
				
		}
}