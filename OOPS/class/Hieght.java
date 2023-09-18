import java.util.Scanner;
class Hieght
{
		private int f,i;
		private Scanner sc=new Scanner(System.in);
		public void setData()
		{
			System.out.println("enter hieght in feet...");
			int f=sc.nextInt();
			System.out.println("enter inche");
			int i=sc.nextInt();
			this.f=f;
			this.i=i;
		}
		public void display()
		{
			System.out.println(this.f+" feet "+this.i+" inch ");
		}
		public void addHieght(Hieght k1,Hieght k2)
		{
			this.f=k1.f+k2.f;
			this.i=k1.i+k2.i;
			
				if(i>=12)
				{
					this.f= this.f+this.i/12;
					this.i=this.i%12;
				}
		}
}
class Test
{
		public static void main(String args [])
		{
			Hieght h1=new Hieght();
			Hieght h2=new Hieght();
			Hieght h3=new Hieght();
			h1.setData();
			h2.setData();
			h1.display();
			h2.display();
			h3.addHieght(h1,h2);
			h3.display();
		}
}
